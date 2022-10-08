package com.gcsj.school;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.gcsj.school.schoolDriver;
import com.gcsj.school.schoolMapper;
import com.gcsj.school.schoolReduce;

public class schoolDriver {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        //1.获取job
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf);

        //2.设置jar包
        job.setJarByClass(schoolDriver.class);

        //3.关联Mapper和reducer
        job.setMapperClass(schoolMapper.class);
        job.setReducerClass(schoolReduce.class);

        //4.设置map输入的kv
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(Text.class);

        //5.设置最终的kv
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(NullWritable.class);

        //6.设置输入和输出路径
        //FileInputFormat.setInputPaths(job, new Path("G:\\知识\\工程实践1\\工程实践3\\data\\part-r-00000"));
        //FileOutputFormat.setOutputPath(job, new Path("G:\\知识\\工程实践1\\工程实践3\\data\\school"));
        FileInputFormat.setInputPaths(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        //7.提交job
        boolean res = job.waitForCompletion(true);

        System.exit(res ? 0 : 1);
    }
}

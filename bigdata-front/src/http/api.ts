import $http from './index';

interface loginData {
    nickName: string,
    password: string
}
interface registerData {
    nickName: string,
    password: string
}
interface changeData {
    id:number,
   
}
interface schoolData {
    enrollmentInfo:{
    schoolName:string,
    province: string,
    profess:string,
    subject:string;
    }
    pageNum:number,
    pageSize:number
}

export const login =
    (data: loginData) => $http({
        url: "/user/login",
        method: "post",
        data
    })
export const register = (data: registerData) => $http({
    url: "/user/register",
    method: "post",
    data
})

export const change = (data:changeData)=>$http({
    url:"",
    method:"post",
    data})
    
export const getUsers = (params) => $http({
    url: '/admin/api/getUsers',
    method: 'get',
    params
})
export const getschools = (data:schoolData) => $http({
    url: '/selectEnrollmentInfo',
    method: 'post',
    data
})

export const getOne = (params) => $http({
    url: '/user/getOne',
    method: 'get',
    params
})


export const selectAllProvince = () => $http({
    url: '/selectAllProvince',
    method: 'get',
})



export const selectSourceInfo = () => $http({
    url: '/selectSourceInfo',
    method: 'get',
})



export const selectUPMByRanking = () => $http({
    url: '/selectUPMByRanking',
    method: 'get',
})


export const selectPMByRanking = () => $http({
    url: '/selectPMByRanking',
    method: 'get',
})

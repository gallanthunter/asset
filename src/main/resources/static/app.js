/**
 * Created by ZhangZhijun on 2015/8/30.
 */
angular.module('app',[
    'ngRoute'
])
    .config(function($routeProvider){
        $routeProvider
        .when('/',{
            templateUrl:'',
            controller:''
        })
        .when('/login',{

        })
        .when('/asset/',{

        })
        .otherwise({

        })
    })
;
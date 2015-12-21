/**
 * Function:
 * Author:ZhangZhijun
 * Date: 2015/11/11
 */
var app = angular.module('app',[
    'chart.js',
    'ui.router'
]);

app.controller('MainController', function(){
    var vm = this;
    vm.title = 'asset management platfrom!'
});

app.config(['$stateProvider','$urlRouterProvider','$locationProvider'],function($stateProvider,$urlRouterProvider,$locationProvider){
    $urlRouterProvider
    .when('index','/')
    .when('list','/list')
    .when('statistics','/statistics')
    .when('about','/about')
    .otherwise('index');

    $stateProvider
    .state('index',{
        url:'/',
        template:'index.html'
    })
    .state('index.list',{
        url:'/list',
        template:'/views/assetList.html'
    })
    .state('index.statistics',{
        url:'/statistics',
        templateUrl:'views/statistics/html'
    })
    .state('index.about',{
        url:'/about.html',
        templateUrl:'vies/about.html'
    })
});
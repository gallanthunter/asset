/**
 * Created by ZhangZhijun on 2015/8/30.
 */
var app = angular.module('app', [
        'ui.router'
    ])
    .config(function ($stateProvider, $urlRouterProvider) {

        $stateProvider
            .state('index', {
                url: '/',
                templateUrl: 'index.html',
                controller: 'indexController'
            })
            .state('index.list', {
                url: '/asset/list',
                templateUrl: '/views/assetList.html'
            })
            .state('index.statistics', {
                url: '/asset/statistics',
                templateUrl: 'views/statistics/html'
            })
            .state('index.about', {
                url: '/about.html',
                templateUrl: 'vies/about.html'
            });

        $urlRouterProvider
            .when('', {
                url: '/'
            })
        ;
    });
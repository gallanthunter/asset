/**
 * Created by ZhangZhijun on 2015/8/30.
 */
var app = angular.module('app', [
        'ui.router'
    ])
    .config(function ($stateProvider, $urlRouterProvider) {

        $stateProvider
            .state('header', {
                url: '/header',
                templateUrl: '/views/header.html'
            })
            .state('list', {
                url: '/asset/list',
                templateUrl: '/views/assetList.html'
            })
            .state('statistics', {
                url: '/asset/statistics',
                templateUrl: 'views/statistics.html'
            })
            .state('footer', {
                            url: '/footer',
                            templateUrl: 'views/footer.html'
                        })
            .state('about', {
                url: '/about.html',
                templateUrl: 'vies/about.html'
            });

        $urlRouterProvider
            .when('', {
                url: '/header'
            })
        ;
    });
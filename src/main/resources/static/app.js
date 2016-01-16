/**
 * Created by ZhangZhijun on 2015/8/30.
 */
var app = angular.module('app', [
        'ngRouter'
    ])
    .config(['$routeProvider',function ($routeProvider) {

        $routeProvider
            .when('/' ,{
                templateUrl: 'index.html',
                controller: 'IndexController'
            })
            .when('/asset',{
                templateUrl: 'views/assetList.html'
            })
            .when('/about',{
                templateUrl: 'views/about.html'
            })
            .otherwise({
                redirectTo: '/'
            })

    }]);
(function () {
    var myApp = angular.module("myApp", ["ui.router"]);

    /**
     * 路由
     */
    myApp.config(function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise("/");
        $stateProvider
            .state("/", {
                url: "/",
                templateUrl: "html/index.html",
                controller: "IndexCtrl"
            })
            .state({
                name: "/.a",
                url: "a",
                templateUrl: "html/a.html",
                controller: "ACtrl"
            })
            .state({
                name: "/.b",
                url: "b",
                templateUrl: "html/b.html",
                controller: "BCtrl"
            });
    });

    /**
     * 控制器
     */
    myApp.controller("Ctrl", function ($scope) {
    });
    myApp.controller("IndexCtrl", function ($scope) {
    });
    myApp.controller("ACtrl", function ($scope) {
    });
    myApp.controller("BCtrl", function ($scope) {
    });

})();
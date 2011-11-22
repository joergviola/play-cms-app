package controllers;

import play.mvc.Scope.Session;

public class Security extends Secure.Security {
    static boolean check(String profile) {
        return profile.equals(Session.current().get("username"));
    }
	static void onDisconnected() {
		redirect("/");
	}
}

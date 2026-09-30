package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zsb {
    public ct6 a;
    public ftb d;
    public q3c e = yu4.a;
    public String b = "GET";
    public qi6 c = new qi6();

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        qi6 qi6Var = this.c;
        qi6Var.getClass();
        xdc.p(str);
        xdc.q(str2, str);
        qi6Var.f(str);
        xdc.g(qi6Var, str, str2);
    }

    public final void b(String str, ftb ftbVar) {
        str.getClass();
        if (str.length() <= 0) {
            qc0.j("method.isEmpty() == true");
            return;
        }
        if (ftbVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                qc0.o(ib8.j("method ", str, " must have a request body."));
                return;
            }
        } else if (!ym8.E(str)) {
            qc0.o(ib8.j("method ", str, " must not have a request body."));
            return;
        }
        this.b = str;
        this.d = ftbVar;
    }

    public final void c(String str) {
        str.getClass();
        if (c5e.C(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (c5e.C(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        bt6 bt6Var = new bt6();
        bt6Var.d(null, str);
        this.a = bt6Var.a();
    }
}

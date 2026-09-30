package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a4f implements v3f {
    public final qq0 a;
    public final String b;
    public final jv4 c;
    public final a3f d;
    public final f4f e;

    public a4f(qq0 qq0Var, String str, jv4 jv4Var, a3f a3fVar, f4f f4fVar) {
        this.a = qq0Var;
        this.b = str;
        this.c = jv4Var;
        this.d = a3fVar;
        this.e = f4fVar;
    }

    public final void a(vo0 vo0Var, g4f g4fVar) {
        String str = this.b;
        if (str == null) {
            r82.g("Null transportName");
            return;
        }
        a3f a3fVar = this.d;
        if (a3fVar == null) {
            r82.g("Null transformer");
            return;
        }
        f4f f4fVar = this.e;
        ks3 ks3Var = f4fVar.c;
        qq0 qq0VarB = this.a.b(vo0Var.b);
        wo0 wo0Var = new wo0();
        wo0Var.w = new HashMap();
        wo0Var.g = Long.valueOf(f4fVar.a.e());
        wo0Var.v = Long.valueOf(f4fVar.b.e());
        wo0Var.b = str;
        wo0Var.f = new cv4(this.c, (byte[]) a3fVar.apply(vo0Var.a));
        wo0Var.d = null;
        yp0 yp0Var = vo0Var.c;
        if (yp0Var != null) {
            wo0Var.e = yp0Var.a;
        }
        ks3Var.b.execute(new de1(ks3Var, qq0VarB, g4fVar, wo0Var.c(), 2));
    }
}

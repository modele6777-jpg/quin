package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class unb extends jnb implements td7 {
    public final snb a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public unb(snb snbVar, Annotation[] annotationArr, String str, boolean z) {
        annotationArr.getClass();
        this.a = snbVar;
        this.b = annotationArr;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.td7
    public final tmb a(dx5 dx5Var) {
        dx5Var.getClass();
        return vpf.y(this.b, dx5Var);
    }

    @Override // defpackage.td7
    public final Collection getAnnotations() {
        return vpf.E(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(unb.class.getName());
        sb.append(": ");
        sb.append(this.d ? "vararg " : "");
        String str = this.c;
        sb.append(str != null ? t99.d(str) : null);
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}

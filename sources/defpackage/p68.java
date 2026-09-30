package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p68 {
    public StringBuilder e;
    public String f;
    public char g;
    public StringBuilder h;
    public int a = 1;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean i = false;

    public final void a() {
        if (this.i) {
            String strB = uy4.b(this.f);
            StringBuilder sb = this.h;
            String strB2 = sb != null ? uy4.b(sb.toString()) : null;
            String string = this.e.toString();
            o68 o68Var = new o68();
            o68Var.g = string;
            o68Var.h = strB;
            o68Var.i = strB2;
            ArrayList arrayList = this.d;
            o68Var.g(arrayList);
            arrayList.clear();
            this.c.add(o68Var);
            this.e = null;
            this.i = false;
            this.f = null;
            this.h = null;
        }
    }
}

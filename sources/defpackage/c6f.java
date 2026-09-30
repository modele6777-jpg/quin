package defpackage;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c6f {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public sne r;
    public String t;
    public String u;
    public String v;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(c6f c6fVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c6fVar != null) {
            if (!this.c && c6fVar.c) {
                this.b = c6fVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = c6fVar.h;
            }
            if (this.i == -1) {
                this.i = c6fVar.i;
            }
            if (this.a == null && (str = c6fVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = c6fVar.f;
            }
            if (this.g == -1) {
                this.g = c6fVar.g;
            }
            if (this.n == -1) {
                this.n = c6fVar.n;
            }
            if (this.o == null && (alignment2 = c6fVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = c6fVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = c6fVar.q;
            }
            if (this.j == -1) {
                this.j = c6fVar.j;
                this.k = c6fVar.k;
            }
            if (this.r == null) {
                this.r = c6fVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = c6fVar.s;
            }
            if (this.t == null) {
                this.t = c6fVar.t;
            }
            if (this.u == null) {
                this.u = c6fVar.u;
            }
            if (this.v == null) {
                this.v = c6fVar.v;
            }
            if (!this.e && c6fVar.e) {
                this.d = c6fVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i = c6fVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}

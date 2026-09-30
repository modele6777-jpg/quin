package defpackage;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r23 {
    public Object A;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    public r23(m6c m6cVar, sug sugVar) {
        Object obj = akd.c;
        this.c = this;
        this.a = m6cVar;
        this.b = sugVar;
        this.d = ks0.c(this, 1);
        this.e = ks0.c(this, 0);
        this.f = ks0.c(this, 5);
        int i = 4;
        sug sugVar2 = new sug(this, 7, i);
        akd akdVar = new akd();
        akdVar.b = obj;
        akdVar.a = sugVar2;
        this.g = akdVar;
        this.h = ks0.c(this, 8);
        this.i = ks0.c(this, 9);
        this.j = ks0.c(this, 10);
        this.k = ks0.c(this, 6);
        this.l = ks0.c(this, 12);
        this.m = ks0.c(this, 13);
        this.n = ks0.c(this, 11);
        this.o = ks0.c(this, 17);
        this.p = ks0.c(this, 16);
        sug sugVar3 = new sug(this, 18, i);
        akd akdVar2 = new akd();
        akdVar2.b = obj;
        akdVar2.a = sugVar3;
        this.q = akdVar2;
        this.r = ks0.c(this, 19);
        this.s = ks0.c(this, 15);
        this.t = ks0.c(this, 20);
        this.u = ks0.c(this, 14);
        this.A = new sug(this, i, i);
        this.v = ks0.c(this, 3);
        this.w = ks0.c(this, 2);
        this.x = ks0.c(this, 21);
        this.y = ks0.c(this, 22);
        this.z = ks0.c(this, 23);
    }

    public Context a() {
        return ((dh1) ((m6c) this.a).b).a;
    }

    public void b(byte[] bArr, int i) {
        if (((byte[]) this.f) == null || i == 3 || !Objects.equals((Integer) this.g, 3)) {
            this.f = (byte[]) bArr.clone();
            this.g = Integer.valueOf(i);
        }
    }
}

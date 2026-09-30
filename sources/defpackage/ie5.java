package defpackage;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ie5 implements cyc {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public ie5(cyc cycVar, a26 a26Var) {
        this.a = 2;
        cycVar.getClass();
        this.b = cycVar;
        this.c = a26Var;
    }

    @Override // defpackage.cyc
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ge5(this);
            case 1:
                return new l66(this, (byte) 0);
            case 2:
                return new ue5(this);
            default:
                return new l66(this);
        }
    }

    public ie5(zi5 zi5Var, yt2 yt2Var) {
        this.a = 3;
        this.b = zi5Var;
        this.c = yt2Var;
    }

    public ie5(File file) {
        this.a = 0;
        this.b = file;
        this.c = je5.a;
    }

    public ie5(x16 x16Var, a26 a26Var) {
        this.a = 1;
        a26Var.getClass();
        this.b = x16Var;
        this.c = a26Var;
    }
}

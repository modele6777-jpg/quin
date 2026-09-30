package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bx7 {
    public final int a;
    public final ax7[] b;
    public final fz3 c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public bx7(int i, ax7[] ax7VarArr, fz3 fz3Var, List list, int i2) {
        this.a = i;
        this.b = ax7VarArr;
        this.c = fz3Var;
        this.d = list;
        this.e = i2;
        int iMax = 0;
        for (ax7 ax7Var : ax7VarArr) {
            iMax = Math.max(iMax, ax7Var.n);
        }
        this.f = iMax;
        int i3 = iMax + this.e;
        this.g = i3 >= 0 ? i3 : 0;
    }

    public final ax7[] a(int i, int i2, int i3) {
        ax7[] ax7VarArr = this.b;
        int length = ax7VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            ax7 ax7Var = ax7VarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((af6) this.d.get(i5)).a;
            ax7Var.d(i, ((int[]) this.c.c)[i6], i2, i3, this.a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return ax7VarArr;
    }
}

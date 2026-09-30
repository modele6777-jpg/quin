package defpackage;

import android.graphics.Point;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wy2 implements an9, xt3 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wy2(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    @Override // defpackage.xt3
    public yob k(int i, h1f h1fVar, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        h1f h1fVar2 = h1fVar;
        vt3 vt3Var = (vt3) this.a;
        String str = (String) this.b;
        int[] iArr2 = (int[]) this.c;
        Point point = (Point) this.d;
        int i6 = iArr2[i];
        int i7 = point != null ? point.x : vt3Var.e;
        int i8 = point != null ? point.y : vt3Var.f;
        boolean z = vt3Var.h;
        if (i7 == Integer.MAX_VALUE || i8 == Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else {
            int i9 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < h1fVar2.a; i10++) {
                rr5 rr5Var = h1fVar2.d[i10];
                int i11 = rr5Var.w;
                int i12 = rr5Var.x;
                if (i11 > 0 && i12 > 0) {
                    if (!z) {
                        i4 = i8;
                        i5 = i7;
                    } else if ((i11 > i12) != (i7 > i8)) {
                        i5 = i8;
                        i4 = i7;
                    } else {
                        i4 = i8;
                        i5 = i7;
                    }
                    int i13 = i11 * i4;
                    int i14 = i12 * i5;
                    Point point2 = i13 >= i14 ? new Point(i5, pqf.e(i14, i11)) : new Point(pqf.e(i13, i12), i4);
                    int i15 = rr5Var.w;
                    int i16 = i15 * i12;
                    if (i15 >= ((int) (point2.x * 0.98f)) && i12 >= ((int) (point2.y * 0.98f)) && i16 < i9) {
                        i9 = i16;
                    }
                }
            }
            i2 = i9;
        }
        dy6 dy6VarM = jy6.m();
        int i17 = 0;
        while (i17 < h1fVar2.a) {
            rr5 rr5Var2 = h1fVar2.d[i17];
            int i18 = rr5Var2.w;
            int i19 = (i18 == -1 || (i3 = rr5Var2.x) == -1) ? -1 : i18 * i3;
            dy6VarM.b(new zt3(i, h1fVar2, i17, vt3Var, iArr[i17], str, i6, i2 == Integer.MAX_VALUE || (i19 != -1 && i19 <= i2)));
            i17++;
            h1fVar2 = h1fVar;
        }
        return dy6VarM.g();
    }

    @Override // defpackage.an9
    public void r(Exception exc) {
        CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2((CredentialProviderPlayServicesImpl) this.a, (CancellationSignal) this.b, (Executor) this.c, (iy2) this.d, exc);
    }
}

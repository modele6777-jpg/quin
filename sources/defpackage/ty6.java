package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ty6 extends py6 {
    public final Comparator d;

    public ty6(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.d = comparator;
    }

    @Override // defpackage.py6, defpackage.yx6
    public final yx6 a(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // defpackage.py6
    /* JADX INFO: renamed from: g */
    public final py6 a(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // defpackage.py6
    public final /* bridge */ /* synthetic */ ry6 h() {
        throw null;
    }

    public final gpb i() {
        gpb gpbVar;
        Object[] objArrCopyOf = this.a;
        int i = this.b;
        Comparator comparator = this.d;
        if (i == 0) {
            gpbVar = vy6.r(comparator);
        } else {
            int i2 = vy6.f;
            nk8.n(i, objArrCopyOf);
            Arrays.sort(objArrCopyOf, 0, i, comparator);
            int i3 = 1;
            for (int i4 = 1; i4 < i; i4++) {
                Object obj = objArrCopyOf[i4];
                if (comparator.compare(obj, objArrCopyOf[i3 - 1]) != 0) {
                    objArrCopyOf[i3] = obj;
                    i3++;
                }
            }
            Arrays.fill(objArrCopyOf, i3, i, (Object) null);
            if (i3 < objArrCopyOf.length / 2) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            }
            gpbVar = new gpb(jy6.k(i3, objArrCopyOf), comparator);
        }
        this.b = gpbVar.g.size();
        this.c = true;
        return gpbVar;
    }
}

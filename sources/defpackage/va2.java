package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class va2 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ va2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                for (a26 a26Var : (a26[]) obj3) {
                    int iM = i7h.m((Comparable) a26Var.d(obj), (Comparable) a26Var.d(obj2));
                    if (iM != 0) {
                        return iM;
                    }
                }
                return 0;
            case 1:
                zo8 zo8Var = (zo8) obj3;
                return zo8Var.f(obj2) - zo8Var.f(obj);
            case 2:
                return ((Number) ((b3b) obj3).z(obj, obj2)).intValue();
            default:
                return ((Number) ((wf8) obj3).z(obj, obj2)).intValue();
        }
    }
}

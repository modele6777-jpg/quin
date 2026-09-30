package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gb1 extends ya1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gb1(Method method, boolean z, int i, int i2) {
        super(method, z, i);
        this.f = i2;
    }

    @Override // defpackage.ya1, defpackage.sa1
    public final Object call(Object[] objArr) {
        int i = this.f;
        objArr.getClass();
        switch (i) {
            case 0:
                d(objArr.length);
                return g(objArr.length <= 1 ? new Object[0] : qd0.f0(objArr, 1, objArr.length), objArr[0]);
            case 1:
                d(objArr.length);
                f(qd0.m0(objArr));
                return g(objArr.length <= 1 ? new Object[0] : qd0.f0(objArr, 1, objArr.length), null);
            default:
                d(objArr.length);
                return g(objArr, null);
        }
    }
}

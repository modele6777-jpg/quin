package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xa1 extends ya1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xa1(Field field, boolean z, int i) {
        super(field, z);
        this.f = i;
    }

    @Override // defpackage.hb1
    public void e(Object[] objArr) {
        switch (this.f) {
            case 1:
                objArr.getClass();
                d(objArr.length);
                f(qd0.m0(objArr));
                break;
            default:
                super.e(objArr);
                break;
        }
    }
}

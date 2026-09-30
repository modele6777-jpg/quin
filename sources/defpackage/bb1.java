package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bb1 extends cb1 {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb1(Field field, boolean z, boolean z2, int i) {
        super(field, z, z2);
        this.g = i;
    }

    @Override // defpackage.cb1, defpackage.hb1
    public void e(Object[] objArr) {
        switch (this.g) {
            case 1:
                objArr.getClass();
                super.e(objArr);
                f(qd0.m0(objArr));
                break;
            default:
                super.e(objArr);
                break;
        }
    }
}

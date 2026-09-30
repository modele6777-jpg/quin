package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class za1 extends cb1 implements d21 {
    public final Object g;

    public za1(Field field, boolean z, Object obj) {
        super(field, z, false);
        this.g = obj;
    }

    @Override // defpackage.cb1, defpackage.sa1
    public final Object call(Object[] objArr) throws IllegalAccessException {
        objArr.getClass();
        e(objArr);
        ((Field) this.c).set(this.g, qd0.l0(objArr));
        return wef.a;
    }
}

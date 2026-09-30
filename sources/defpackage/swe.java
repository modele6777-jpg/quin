package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class swe implements sa1 {
    public static final swe a = new swe();

    @Override // defpackage.sa1
    public final List a() {
        return pu4.a;
    }

    @Override // defpackage.sa1
    public final Member b() {
        return null;
    }

    @Override // defpackage.sa1
    public final boolean c() {
        return false;
    }

    @Override // defpackage.sa1
    public final Object call(Object[] objArr) {
        objArr.getClass();
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // defpackage.sa1
    public final Type getReturnType() {
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }
}

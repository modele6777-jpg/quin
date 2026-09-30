package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lnb extends nnb {
    public final Field a;

    public lnb(Field field) {
        this.a = field;
    }

    @Override // defpackage.nnb
    public final Member b() {
        return this.a;
    }
}

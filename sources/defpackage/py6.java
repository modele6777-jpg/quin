package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class py6 extends yx6 {
    @Override // defpackage.yx6
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public py6 a(Object obj) {
        obj.getClass();
        b(obj);
        return this;
    }

    public ry6 h() {
        int i = this.b;
        if (i == 0) {
            int i2 = ry6.c;
            return fpb.x;
        }
        Object[] objArr = this.a;
        if (i != 1) {
            ry6 ry6VarM = ry6.m(i, objArr);
            this.b = ry6VarM.size();
            this.c = true;
            return ry6VarM;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = ry6.c;
        return new vkd(obj);
    }
}

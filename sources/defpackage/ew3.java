package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ew3 extends ejd implements y7e {
    public final f8e n;

    public ew3(f8e f8eVar) {
        super(new b8e[2], new cv1[2]);
        int i = this.g;
        tm3[] tm3VarArr = this.e;
        pa7.J(i == tm3VarArr.length);
        for (tm3 tm3Var : tm3VarArr) {
            tm3Var.h(UserMetadata.MAX_ATTRIBUTE_SIZE);
        }
        this.n = f8eVar;
    }

    @Override // defpackage.ejd
    public final tm3 g() {
        return new b8e(1);
    }

    @Override // defpackage.ejd
    public final um3 h() {
        return new cv1(this);
    }

    @Override // defpackage.ejd
    public final rm3 i(Throwable th) {
        return new z7e("Unexpected decode error", th);
    }

    @Override // defpackage.ejd
    public final rm3 j(tm3 tm3Var, um3 um3Var, boolean z) {
        b8e b8eVar = (b8e) tm3Var;
        cv1 cv1Var = (cv1) um3Var;
        try {
            ByteBuffer byteBuffer = b8eVar.e;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            f8e f8eVar = this.n;
            if (z) {
                f8eVar.reset();
            }
            x7e x7eVarG = f8eVar.g(bArrArray, 0, iLimit);
            long j = b8eVar.g;
            long j2 = b8eVar.x;
            cv1Var.c = j;
            cv1Var.e = x7eVarG;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            cv1Var.f = j;
            cv1Var.d = false;
            return null;
        } catch (z7e e) {
            return e;
        }
    }

    @Override // defpackage.y7e
    public final void c(long j) {
    }
}

package defpackage;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sr6 extends qr6 {
    public long e;
    public boolean f;
    public final /* synthetic */ vr6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr6(vr6 vr6Var, ct6 ct6Var) {
        super(vr6Var, ct6Var);
        ct6Var.getClass();
        this.g = vr6Var;
        this.e = -1L;
        this.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        if (r18.f == false) goto L52;
     */
    @Override // defpackage.qr6, defpackage.mtd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c0(defpackage.f41 r19, long r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr6.c0(f41, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.c) {
            return;
        }
        if (this.f) {
            TimeZone timeZone = keg.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = keg.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.g.b.e();
                b(vr6.f);
            }
        }
        this.c = true;
    }
}

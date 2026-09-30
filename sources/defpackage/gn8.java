package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gn8 implements u47 {
    public final e5b a;

    public gn8(e5b e5bVar) {
        this.a = e5bVar;
    }

    @Override // defpackage.u47
    public final void a(une uneVar) throws IOException {
        if (uneVar.c.length() > 400) {
            uneVar.e();
            this.a.invoke();
        }
    }
}

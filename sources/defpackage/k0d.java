package defpackage;

import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k0d implements czc {
    public final t0d a;

    public k0d(t0d t0dVar) {
        t0dVar.getClass();
        this.a = t0dVar;
    }

    @Override // defpackage.czc
    public final Object B(FileInputStream fileInputStream) throws mw2 {
        try {
            vg7 vg7Var = wg7.d;
            String str = new String(lmg.p0(fileInputStream), ox1.a);
            vg7Var.getClass();
            return (j0d) vg7Var.b(j0d.Companion.serializer(), str);
        } catch (Exception e) {
            throw new mw2("Cannot parse session data", e);
        }
    }

    @Override // defpackage.czc
    public final Object e() {
        return new j0d(this.a.a(null), null, null);
    }

    @Override // defpackage.czc
    public final Object v0(Object obj, abf abfVar, ke5 ke5Var) throws IOException {
        byte[] bytes = wg7.d.d(j0d.Companion.serializer(), (j0d) obj).getBytes(ox1.a);
        bytes.getClass();
        abfVar.a.write(bytes);
        return wef.a;
    }
}

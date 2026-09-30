package defpackage;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0d {
    public final yxe a;
    public final grf b;

    public t0d(yxe yxeVar, grf grfVar) {
        yxeVar.getClass();
        grfVar.getClass();
        this.a = yxeVar;
        this.b = grfVar;
    }

    public final n0d a(n0d n0dVar) {
        String str;
        this.b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        String string = uuidRandomUUID.toString();
        string.getClass();
        String lowerCase = c5e.A(string, "-", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (n0dVar == null || (str = n0dVar.b) == null) ? lowerCase : str;
        int i = n0dVar != null ? n0dVar.c + 1 : 0;
        this.a.getClass();
        return new n0d(i, yxe.a().b, lowerCase, str2);
    }
}

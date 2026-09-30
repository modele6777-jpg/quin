package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j55 extends gbe implements a26 {
    final /* synthetic */ String $url;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j55(String str, xn2 xn2Var) {
        super(1, xn2Var);
        this.$url = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new j55(this.$url, (xn2) obj).r(wef.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        boolean z;
        long jA;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        yid yidVar = k55.b;
        String str = this.$url;
        yidVar.getClass();
        str.getClass();
        byte[] bArr = (byte[]) yidVar.e(str).b.get("custom_tts_pending_complete_length");
        long j = bArr != null ? ByteBuffer.wrap(bArr).getLong() : -1L;
        ja8 ja8Var = new ja8();
        ja8Var.b.add("custom_tts_pending_complete_length");
        ja8Var.a.remove("custom_tts_pending_complete_length");
        if (j > 0) {
            synchronized (yidVar) {
                t81 t81VarV = yidVar.c.V(str);
                jA = t81VarV != null ? t81VarV.a() : -9223372036854775807L;
            }
            if ((jA >= 0 ? jA : 0L) < j) {
                yidVar.b(str, ja8Var);
                z = false;
            } else {
                ja8Var.a(Long.valueOf(j), "exo_len");
                yidVar.b(str, ja8Var);
                z = true;
            }
        } else {
            yidVar.b(str, ja8Var);
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

package defpackage;

import ai.askquin.datastore.model.UserProfile;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dpf extends gbe implements l26 {
    final /* synthetic */ OutputStream $output;
    final /* synthetic */ UserProfile $t;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpf(OutputStream outputStream, UserProfile userProfile, xn2 xn2Var) {
        super(2, xn2Var);
        this.$output = outputStream;
        this.$t = userProfile;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dpf(this.$output, this.$t, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws IOException {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        OutputStream outputStream = this.$output;
        byte[] bytes = fzc.a.d(UserProfile.Companion.serializer(), this.$t).getBytes(ox1.a);
        bytes.getClass();
        outputStream.write(bytes);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws IOException {
        dpf dpfVar = (dpf) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        dpfVar.r(wefVar);
        return wefVar;
    }
}

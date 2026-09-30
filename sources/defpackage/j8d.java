package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j8d extends gbe implements l26 {
    final /* synthetic */ mmb $itemUri;
    final /* synthetic */ mmb $legacyFile;
    final /* synthetic */ ContentResolver $resolver;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8d(mmb mmbVar, mmb mmbVar2, ContentResolver contentResolver, xn2 xn2Var) {
        super(2, xn2Var);
        this.$itemUri = mmbVar;
        this.$legacyFile = mmbVar2;
        this.$resolver = contentResolver;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new j8d(this.$itemUri, this.$legacyFile, this.$resolver, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Uri uri = (Uri) this.$itemUri.element;
        if (uri != null) {
            try {
                ok8.j(this.$resolver.delete(uri, null, null));
            } catch (Exception e) {
                tec.t(hf8.Q, "ShareImageFile", "Failed to remove incomplete MediaStore image", e);
            }
        }
        File file = (File) this.$legacyFile.element;
        if (file != null) {
            return Boolean.valueOf(file.delete());
        }
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((j8d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

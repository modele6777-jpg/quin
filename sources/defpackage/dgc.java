package defpackage;

import android.net.Uri;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dgc extends gbe implements l26 {
    final /* synthetic */ Uri $changedUri;
    final /* synthetic */ long $generationAtChange;
    final /* synthetic */ x48 $lifecycleOwner;
    final /* synthetic */ igc $metadata;
    final /* synthetic */ LinkedHashSet<String> $observedImages;
    final /* synthetic */ a26 $onScreenshot;
    final /* synthetic */ imb $registered;
    final /* synthetic */ lmb $registrationGeneration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgc(imb imbVar, long j, lmb lmbVar, x48 x48Var, Uri uri, igc igcVar, LinkedHashSet linkedHashSet, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$registered = imbVar;
        this.$generationAtChange = j;
        this.$registrationGeneration = lmbVar;
        this.$lifecycleOwner = x48Var;
        this.$changedUri = uri;
        this.$metadata = igcVar;
        this.$observedImages = linkedHashSet;
        this.$onScreenshot = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dgc(this.$registered, this.$generationAtChange, this.$registrationGeneration, this.$lifecycleOwner, this.$changedUri, this.$metadata, this.$observedImages, this.$onScreenshot, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        boolean z = this.$registered.element;
        long j = this.$generationAtChange;
        long j2 = this.$registrationGeneration.element;
        wef wefVar = wef.a;
        if (z && j == j2 && ((a58) this.$lifecycleOwner.k()).i.compareTo(g48.e) >= 0) {
            Uri uri = this.$changedUri;
            igc igcVar = this.$metadata;
            if (this.$observedImages.add(uri + ":" + (igcVar != null ? hgc.d(igcVar) : null))) {
                if (this.$observedImages.size() > 100) {
                    LinkedHashSet<String> linkedHashSet = this.$observedImages;
                    linkedHashSet.remove(s72.u0(linkedHashSet));
                }
                a26 a26Var = this.$onScreenshot;
                igc igcVar2 = this.$metadata;
                boolean z2 = false;
                if (igcVar2 != null && hgc.w(igcVar2, this.$changedUri)) {
                    z2 = true;
                }
                a26Var.d(Boolean.valueOf(z2));
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        dgc dgcVar = (dgc) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        dgcVar.r(wefVar);
        return wefVar;
    }
}

package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import com.adjust.sdk.Constants;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oq1 extends gbe implements l26 {
    final /* synthetic */ TarotCardType $cardType;
    final /* synthetic */ tt1 $cardZoom;
    final /* synthetic */ ghc $scrollState;
    final /* synthetic */ float $skinThumbCornerPx;
    final /* synthetic */ x16 $sourceBounds;
    final /* synthetic */ TarotSkinIdentify $targetSkin;
    final /* synthetic */ int $themeColorArgb;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq1(ghc ghcVar, TarotCardType tarotCardType, tt1 tt1Var, TarotSkinIdentify tarotSkinIdentify, int i, x16 x16Var, float f, xn2 xn2Var) {
        super(2, xn2Var);
        this.$scrollState = ghcVar;
        this.$cardType = tarotCardType;
        this.$cardZoom = tt1Var;
        this.$targetSkin = tarotSkinIdentify;
        this.$themeColorArgb = i;
        this.$sourceBounds = x16Var;
        this.$skinThumbCornerPx = f;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new oq1(this.$scrollState, this.$cardType, this.$cardZoom, this.$targetSkin, this.$themeColorArgb, this.$sourceBounds, this.$skinThumbCornerPx, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ghc ghcVar = this.$scrollState;
            this.label = 1;
            Object objU = eb3.U(ghcVar, this);
            bw2 bw2Var = bw2.a;
            if (objU == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        TarotCardType tarotCardType = this.$cardType;
        if (tarotCardType != null) {
            tt1.c(this.$cardZoom, tarotCardType, this.$targetSkin, this.$themeColorArgb, false, null, (hkb) this.$sourceBounds.invoke(), new Float(this.$skinThumbCornerPx), false, Constants.MINIMAL_ERROR_STATUS_CODE);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((oq1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.draw.model.DrawCardSaves;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tech.chatmind.api.AdditionalInfoAudio;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cr2 extends gbe implements l26 {
    final /* synthetic */ String $additionalText;
    final /* synthetic */ AdditionalInfoAudio $audioInfo;
    final /* synthetic */ DrawCardSaves $saves;
    int I$0;
    int label;
    final /* synthetic */ dr2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr2(dr2 dr2Var, DrawCardSaves drawCardSaves, String str, AdditionalInfoAudio additionalInfoAudio, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = dr2Var;
        this.$saves = drawCardSaves;
        this.$additionalText = str;
        this.$audioInfo = additionalInfoAudio;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new cr2(this.this$0, this.$saves, this.$additionalText, this.$audioInfo, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        QuotaBlockReason quotaBlockReason;
        dr2 dr2Var;
        r0 r0Var;
        DrawCardSaves drawCardSaves;
        String str;
        AdditionalInfoAudio additionalInfoAudio;
        xd4 xd4VarI;
        ud4 ud4Var;
        MixedDeckSnapshot mixedDeck;
        String transcription;
        String str2;
        String assetId;
        fc4 fc4Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            int iF = this.this$0.a.c.F();
            if (this.this$0.a.c.m0()) {
                quotaBlockReason = null;
            } else {
                j4a j4aVar = this.this$0.b;
                this.I$0 = iF;
                this.label = 1;
                obj = j4aVar.a(iF, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            }
            dr2Var = this.this$0;
            if (quotaBlockReason != null) {
                r0.I0(dr2Var.a.c, this.$saves, quotaBlockReason);
            } else {
                r0Var = dr2Var.a.c;
                drawCardSaves = this.$saves;
                str = this.$additionalText;
                additionalInfoAudio = this.$audioInfo;
                r0Var.getClass();
                drawCardSaves.getClass();
                ConcurrentHashMap concurrentHashMap = xfb.a;
                xfb.i(r0Var.I0, "reading");
                xd4VarI = r0Var.I();
                if (xd4VarI instanceof ud4) {
                    ud4Var = (ud4) xd4VarI;
                } else {
                    ud4Var = null;
                }
                if (ud4Var != null) {
                    mixedDeck = drawCardSaves.getMixedDeck();
                    if (mixedDeck == null) {
                        mixedDeck = r0Var.R();
                    }
                    r0Var.D1(mixedDeck);
                    zc4 zc4Var = ud4Var.a;
                    if (str == null) {
                        transcription = str;
                    } else if (additionalInfoAudio != null) {
                        transcription = additionalInfoAudio.getTranscription();
                    } else {
                        transcription = null;
                    }
                    List<TarotCardChoice> choices = drawCardSaves.getChoices();
                    if (additionalInfoAudio != null) {
                        fc4Var = r0Var.H0;
                        if (fc4Var != null) {
                            pa7.g0("divinationKey");
                            throw null;
                        }
                        str2 = fc4Var.a;
                    } else {
                        str2 = null;
                    }
                    if (additionalInfoAudio != null) {
                        assetId = additionalInfoAudio.getAssetId();
                    } else {
                        assetId = null;
                    }
                    r0Var.K1(new ad4(zc4Var, choices, transcription, str2, assetId));
                    r0Var.R0.add(new dt8(zc4Var.a, drawCardSaves.getChoices()));
                    if (additionalInfoAudio != null) {
                        ynb.V(hwf.a(r0Var), null, null, new tf4(r0Var, additionalInfoAudio, null), 3);
                    } else if (str != null) {
                        ynb.V(hwf.a(r0Var), null, null, new vf4(r0Var, str, null), 3);
                    } else {
                        r0Var.V0();
                    }
                }
            }
            this.this$0.a.c.z1(null);
            this.this$0.c.d(Boolean.FALSE);
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        p9b p9bVar = (p9b) obj;
        o9b o9bVar = p9bVar instanceof o9b ? (o9b) p9bVar : null;
        if (o9bVar != null) {
            quotaBlockReason = o9bVar.a;
        } else {
            quotaBlockReason = null;
        }
        dr2Var = this.this$0;
        if (quotaBlockReason != null) {
            r0.I0(dr2Var.a.c, this.$saves, quotaBlockReason);
        } else {
            r0Var = dr2Var.a.c;
            drawCardSaves = this.$saves;
            str = this.$additionalText;
            additionalInfoAudio = this.$audioInfo;
            r0Var.getClass();
            drawCardSaves.getClass();
            ConcurrentHashMap concurrentHashMap2 = xfb.a;
            xfb.i(r0Var.I0, "reading");
            xd4VarI = r0Var.I();
            if (xd4VarI instanceof ud4) {
                ud4Var = (ud4) xd4VarI;
            } else {
                ud4Var = null;
            }
            if (ud4Var != null) {
                mixedDeck = drawCardSaves.getMixedDeck();
                if (mixedDeck == null) {
                    mixedDeck = r0Var.R();
                }
                r0Var.D1(mixedDeck);
                zc4 zc4Var2 = ud4Var.a;
                if (str == null) {
                    transcription = str;
                } else if (additionalInfoAudio != null) {
                    transcription = additionalInfoAudio.getTranscription();
                } else {
                    transcription = null;
                }
                List<TarotCardChoice> choices2 = drawCardSaves.getChoices();
                if (additionalInfoAudio != null) {
                    fc4Var = r0Var.H0;
                    if (fc4Var != null) {
                        pa7.g0("divinationKey");
                        throw null;
                    }
                    str2 = fc4Var.a;
                } else {
                    str2 = null;
                }
                if (additionalInfoAudio != null) {
                    assetId = additionalInfoAudio.getAssetId();
                } else {
                    assetId = null;
                }
                r0Var.K1(new ad4(zc4Var2, choices2, transcription, str2, assetId));
                r0Var.R0.add(new dt8(zc4Var2.a, drawCardSaves.getChoices()));
                if (additionalInfoAudio != null) {
                    ynb.V(hwf.a(r0Var), null, null, new tf4(r0Var, additionalInfoAudio, null), 3);
                } else if (str != null) {
                    ynb.V(hwf.a(r0Var), null, null, new vf4(r0Var, str, null), 3);
                } else {
                    r0Var.V0();
                }
            }
        }
        this.this$0.a.c.z1(null);
        this.this$0.c.d(Boolean.FALSE);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((cr2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

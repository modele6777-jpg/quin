package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.divination.OverviewItem;
import ai.askquin.ui.divination.k;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PathMeasure;
import java.util.LinkedHashMap;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sy1 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ sy1(h0e h0eVar, h0e h0eVar2, d5e d5eVar, h0e h0eVar3, k3f k3fVar, k3f k3fVar2, d5e d5eVar2, my1 my1Var) {
        this.a = 0;
        this.b = h0eVar;
        this.c = h0eVar2;
        this.g = d5eVar;
        this.d = h0eVar3;
        this.e = k3fVar;
        this.f = k3fVar2;
        this.v = d5eVar2;
        this.w = my1Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.w;
        Object obj3 = this.v;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        Object obj9 = this.b;
        switch (i) {
            case 0:
                d5e d5eVar = (d5e) obj4;
                h0e h0eVar = (h0e) obj7;
                h0e h0eVar2 = (h0e) obj6;
                h0e h0eVar3 = (h0e) obj5;
                d5e d5eVar2 = (d5e) obj3;
                my1 my1Var = (my1) obj2;
                sn4 sn4Var = (sn4) obj;
                long j = ((y72) ((h0e) obj9).getValue()).a;
                long j2 = ((y72) ((h0e) obj8).getValue()).a;
                float fP0 = sn4Var.p0(2.0f);
                float f = d5eVar.a;
                float f2 = f / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() >> 32));
                int i2 = y72.l;
                boolean zA = faf.a(j, j2);
                oe5 oe5Var = oe5.a;
                if (zA) {
                    sn4.K0(sn4Var, j, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L), oe5Var, 226);
                } else {
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                    float f3 = fIntBitsToFloat - (f * 2.0f);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                    float fMax = Math.max(0.0f, fP0 - f);
                    sn4.K0(sn4Var, j, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), oe5Var, 224);
                    float f4 = fIntBitsToFloat - f;
                    float f5 = fP0 - f2;
                    sn4.K0(sn4Var, j2, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), d5eVar, 224);
                }
                long j3 = ((y72) h0eVar.getValue()).a;
                float fFloatValue = ((Number) h0eVar2.getValue()).floatValue();
                float fFloatValue2 = ((Number) h0eVar3.getValue()).floatValue();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var.f() >> 32));
                float fP = abg.P(0.4f, 0.5f, fFloatValue2);
                float fP2 = abg.P(0.7f, 0.5f, fFloatValue2);
                float fP3 = abg.P(0.5f, 0.5f, fFloatValue2);
                float fP4 = abg.P(0.3f, 0.5f, fFloatValue2);
                zt ztVar = my1Var.a;
                zt ztVar2 = my1Var.c;
                ztVar.l();
                zt ztVar3 = my1Var.a;
                ztVar3.h(0.2f * fIntBitsToFloat2, fP3 * fIntBitsToFloat2);
                ztVar3.g(fP * fIntBitsToFloat2, fP2 * fIntBitsToFloat2);
                ztVar3.g(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fP4);
                bu buVar = my1Var.b;
                PathMeasure pathMeasure = buVar.a;
                pathMeasure.setPath(ztVar3.a, false);
                ztVar2.l();
                buVar.a(0.0f, pathMeasure.getLength() * fFloatValue, ztVar2);
                sn4.R(sn4Var, ztVar2, j3, d5eVar2, 52);
                break;
            case 1:
                aw2 aw2Var = (aw2) obj9;
                e89 e89Var = (e89) obj8;
                a16 a16Var = (a16) obj7;
                Context context = (Context) obj6;
                l06 l06Var = (l06) obj5;
                Bitmap bitmap = (Bitmap) obj4;
                d16 d16Var = (d16) obj3;
                e89 e89Var2 = (e89) obj2;
                u06 u06Var = (u06) obj;
                u06Var.getClass();
                if (!((Boolean) e89Var.getValue()).booleanValue()) {
                    e89Var.setValue(Boolean.TRUE);
                    ynb.V(aw2Var, null, null, new j06(a16Var, context, u06Var, l06Var, bitmap, d16Var, e89Var2, e89Var, null), 3);
                }
                break;
            case 2:
                r0 r0Var = (r0) obj8;
                tr2 tr2Var = (tr2) obj7;
                t7 t7Var = (t7) obj5;
                aw2 aw2Var2 = (aw2) obj4;
                e89 e89Var3 = (e89) obj3;
                j4a j4aVar = (j4a) obj2;
                OverviewItem.ClarifyingCardItem clarifyingCardItem = (OverviewItem.ClarifyingCardItem) obj;
                clarifyingCardItem.getClass();
                m8 m8Var = new m8((LinkedHashMap) obj9, clarifyingCardItem, r0Var, tr2Var, (shb) obj6, 17);
                if (!((Boolean) e89Var3.getValue()).booleanValue()) {
                    e89Var3.setValue(Boolean.TRUE);
                    mo3 mo3Var = (mo3) t7Var;
                    ynb.V(aw2Var2, null, null, new zv9(j4aVar, mo3Var, mo3Var.a(), r0Var, r0Var.E(), m8Var, "followup_clarifying_card", tr2Var, e89Var3, null), 3);
                }
                break;
            default:
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj;
                tarotCardChoice.getClass();
                k.h((r0) obj9, (MixedDeckSnapshot) obj8, (TarotSkinIdentify) obj7, (shb) obj6, (tt1) obj5, (LinkedHashMap) obj4, (String) obj3, (tr2) obj2, tarotCardChoice, "state_1", k95.Card);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ sy1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.v = obj7;
        this.w = obj8;
    }
}

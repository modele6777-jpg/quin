package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import tech.chatmind.api.personality.PersonalitySection;
import tech.chatmind.api.personality.ShortCard;
import tech.chatmind.api.seasonal.model.SeasonalHistoryItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k38 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k38(MixedDeckSnapshot mixedDeckSnapshot, dd2 dd2Var, int i) {
        this.a = 11;
        this.d = mixedDeckSnapshot;
        this.c = dd2Var;
        this.b = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                dd2 dd2Var = (dd2) obj4;
                g6d g6dVar = (g6d) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    Integer numValueOf = Integer.valueOf(i2);
                    boolean zI = l46Var.i(g6dVar) | l46Var.e(i2);
                    Object objR = l46Var.R();
                    if (zI || objR == sf2.a) {
                        objR = new vj(g6dVar, i2, 5);
                        l46Var.p0(objR);
                    }
                    dd2Var.t(numValueOf, (a26) objR, l46Var, 0);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                kj0.d((j09) obj4, (PersonalitySection) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                if9.h((j09) obj4, (o29) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((ox9) obj4).d(i2, obj3, (l46) obj, k99.P(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                bm8.b(i2, (String) obj4, (c82) obj3, (l46) obj, k99.P(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                hkg.N((j09) obj4, (ShortCard) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                n16.s((vma) obj4, (x16) obj3, (l46) obj, k99.P(1), i2);
                break;
            case 7:
                ((Integer) obj2).getClass();
                ksb.e((j09) obj4, (dsb) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                vlc.a((SeasonalHistoryItem) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                onc.a((y6c) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                p6d.b((cv6) obj4, (Float) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                snd.a((MixedDeckSnapshot) obj3, (dd2) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                o8c.g((TarotSkinIdentify) obj4, (j09) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                nte.a((mue) obj4, (l26) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                ((n3f) obj4).a(obj3, (l46) obj, k99.P(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                v2c.f((c31) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ k38(dd2 dd2Var, int i, g6d g6dVar) {
        this.a = 0;
        this.c = dd2Var;
        this.b = i;
        this.d = g6dVar;
    }

    public /* synthetic */ k38(ox9 ox9Var, int i, Object obj, int i2) {
        this.a = 3;
        this.c = ox9Var;
        this.b = i;
        this.d = obj;
    }

    public /* synthetic */ k38(vma vmaVar, x16 x16Var, int i, int i2) {
        this.a = 6;
        this.c = vmaVar;
        this.d = x16Var;
        this.b = i2;
    }

    public /* synthetic */ k38(int i, String str, c82 c82Var, int i2) {
        this.a = 4;
        this.b = i;
        this.c = str;
        this.d = c82Var;
    }

    public /* synthetic */ k38(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}

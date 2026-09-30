package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.router.AppRoute;
import android.content.Context;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uj3 extends h36 implements a26 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uj3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x034f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0354  */
    /* JADX WARN: Code duplicated, block: B:141:0x035b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0363  */
    /* JADX WARN: Code duplicated, block: B:147:0x036d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0370  */
    /* JADX WARN: Code duplicated, block: B:151:0x0379  */
    /* JADX WARN: Code duplicated, block: B:154:0x0385  */
    /* JADX WARN: Code duplicated, block: B:155:0x0388  */
    /* JADX WARN: Code duplicated, block: B:157:0x0390  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:163:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:166:0x03cf  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:154:0x0385, please report this as an issue */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        Object value;
        String str;
        String str2;
        int iHashCode;
        String str3;
        String str4;
        fl8 fl8Var;
        String str5;
        String str6;
        String str7;
        Object value2;
        lsc lscVar;
        Object value3;
        lsc lscVar2;
        Object value4;
        lsc lscVar3;
        Object value5;
        Object value6;
        f96 f96VarA;
        Object value7;
        f96 f96VarA2;
        Object value8;
        f96 f96VarA3;
        int i = this.a;
        boolean z = true;
        int i2 = 0;
        fl8 fl8VarJ = null;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj;
                tarotSkinIdentify.getClass();
                k75 k75Var = (k75) this.receiver;
                k75Var.getClass();
                ((ys3) k75Var.e).c(tarotSkinIdentify);
                return wefVar;
            case 1:
                TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) obj;
                tarotSkinIdentify2.getClass();
                k75 k75Var2 = (k75) this.receiver;
                k75Var2.getClass();
                s0e s0eVar = k75Var2.v;
                do {
                    value = s0eVar.getValue();
                } while (!s0eVar.l(value, t65.a((t65) value, tarotSkinIdentify2, null, 0, null, null, tarotSkinIdentify2, 30)));
                ynb.V(hwf.a(k75Var2), null, null, new b75(k75Var2, tarotSkinIdentify2, null), 3);
                return wefVar;
            case 2:
                TarotSkinIdentify tarotSkinIdentify3 = (TarotSkinIdentify) obj;
                tarotSkinIdentify3.getClass();
                ol3 ol3Var = (ol3) this.receiver;
                ol3Var.getClass();
                ol3Var.G0 = false;
                ol3Var.F0 = tarotSkinIdentify3;
                ((ys3) ol3Var.c).e(tarotSkinIdentify3);
                return wefVar;
            case 3:
                TarotSkinIdentify tarotSkinIdentify4 = (TarotSkinIdentify) obj;
                tarotSkinIdentify4.getClass();
                ol3 ol3Var2 = (ol3) this.receiver;
                ol3Var2.getClass();
                ol3Var2.G0 = false;
                ol3Var2.F0 = tarotSkinIdentify4;
                ((ys3) ol3Var2.c).c(tarotSkinIdentify4);
                return wefVar;
            case 4:
                TarotSkinIdentify tarotSkinIdentify5 = (TarotSkinIdentify) obj;
                tarotSkinIdentify5.getClass();
                ((ol3) this.receiver).g(tarotSkinIdentify5);
                return wefVar;
            case 5:
                String str8 = (String) obj;
                str8.getClass();
                return ((jz3) this.receiver).l(str8);
            case 6:
                t99 t99Var = (t99) obj;
                t99Var.getClass();
                return ((d04) this.receiver).v0(t99Var);
            case 7:
                zt7 zt7Var = (zt7) obj;
                zt7Var.getClass();
                return new b04((d04) this.receiver, zt7Var);
            case 8:
                ((r0) this.receiver).v((String) obj);
                return wefVar;
            case 9:
                ale aleVar = (ale) obj;
                aleVar.getClass();
                r0 r0Var = (r0) this.receiver;
                r0Var.getClass();
                if ((r0Var.a0() instanceof id4) && !r0Var.n0()) {
                    r0Var.K1(new id4(aleVar.getId()));
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((r0) this.receiver).v((String) obj);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                String str9 = (String) obj;
                str9.getClass();
                return ((ka9) this.receiver).b(str9);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                e95 e95Var = (e95) obj;
                e95Var.getClass();
                ((d95) this.receiver).getClass();
                if (pa7.t(e95Var.e, "share")) {
                    String str10 = e95Var.b;
                    String str11 = "screenshot";
                    switch (str10.hashCode()) {
                        case 805451945:
                            if (str10.equals("DailyCard")) {
                                str = "daily_card";
                                str2 = e95Var.c;
                                iHashCode = str2.hashCode();
                                if (iHashCode != 2092848) {
                                    if (iHashCode != 2374300) {
                                        if (iHashCode == 1577017734 && str2.equals("Screenshot")) {
                                            str3 = e95Var.h;
                                            if (pa7.t(str3, "Completed")) {
                                                str4 = pa7.t(str3, "Cancelled") ? "cancelled" : "completed";
                                            }
                                            fl8Var = new fl8();
                                            fl8Var.put("source", str);
                                            fl8Var.put("format", str11);
                                            fl8Var.put("pathway", "share_result");
                                            fl8Var.put("result", str4);
                                            fl8Var.put("scene", e95Var.d);
                                            str5 = e95Var.g;
                                            if (str5 == null) {
                                                str5 = "";
                                            }
                                            fl8Var.put("target", str5);
                                            str6 = e95Var.n;
                                            if (str6 != null) {
                                            }
                                            str7 = e95Var.o;
                                            if (str7 != null) {
                                            }
                                            fl8Var.put("$insert_id", e95Var.a);
                                            fl8VarJ = fl8Var.j();
                                        }
                                    } else if (str2.equals("Long")) {
                                        str11 = Constants.LONG;
                                        str3 = e95Var.h;
                                        if (pa7.t(str3, "Completed")) {
                                            if (pa7.t(str3, "Cancelled")) {
                                            }
                                        }
                                        fl8Var = new fl8();
                                        fl8Var.put("source", str);
                                        fl8Var.put("format", str11);
                                        fl8Var.put("pathway", "share_result");
                                        fl8Var.put("result", str4);
                                        fl8Var.put("scene", e95Var.d);
                                        str5 = e95Var.g;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        fl8Var.put("target", str5);
                                        str6 = e95Var.n;
                                        if (str6 != null) {
                                        }
                                        str7 = e95Var.o;
                                        if (str7 != null) {
                                        }
                                        fl8Var.put("$insert_id", e95Var.a);
                                        fl8VarJ = fl8Var.j();
                                    }
                                } else if (str2.equals("Card")) {
                                    str11 = "card";
                                    str3 = e95Var.h;
                                    if (pa7.t(str3, "Completed")) {
                                        if (pa7.t(str3, "Cancelled")) {
                                        }
                                    }
                                    fl8Var = new fl8();
                                    fl8Var.put("source", str);
                                    fl8Var.put("format", str11);
                                    fl8Var.put("pathway", "share_result");
                                    fl8Var.put("result", str4);
                                    fl8Var.put("scene", e95Var.d);
                                    str5 = e95Var.g;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    fl8Var.put("target", str5);
                                    str6 = e95Var.n;
                                    if (str6 != null) {
                                    }
                                    str7 = e95Var.o;
                                    if (str7 != null) {
                                    }
                                    fl8Var.put("$insert_id", e95Var.a);
                                    fl8VarJ = fl8Var.j();
                                }
                            }
                            break;
                        case 1167432431:
                            if (str10.equals("DailyCardScreenshot")) {
                                str = "daily_card_screenshot";
                                str2 = e95Var.c;
                                iHashCode = str2.hashCode();
                                if (iHashCode != 2092848) {
                                    if (iHashCode != 2374300) {
                                        if (iHashCode == 1577017734) {
                                            str3 = e95Var.h;
                                            if (pa7.t(str3, "Completed")) {
                                                if (pa7.t(str3, "Cancelled")) {
                                                }
                                            }
                                            fl8Var = new fl8();
                                            fl8Var.put("source", str);
                                            fl8Var.put("format", str11);
                                            fl8Var.put("pathway", "share_result");
                                            fl8Var.put("result", str4);
                                            fl8Var.put("scene", e95Var.d);
                                            str5 = e95Var.g;
                                            if (str5 == null) {
                                                str5 = "";
                                            }
                                            fl8Var.put("target", str5);
                                            str6 = e95Var.n;
                                            if (str6 != null) {
                                            }
                                            str7 = e95Var.o;
                                            if (str7 != null) {
                                            }
                                            fl8Var.put("$insert_id", e95Var.a);
                                            fl8VarJ = fl8Var.j();
                                        }
                                    } else if (str2.equals("Long")) {
                                        str11 = Constants.LONG;
                                        str3 = e95Var.h;
                                        if (pa7.t(str3, "Completed")) {
                                            if (pa7.t(str3, "Cancelled")) {
                                            }
                                        }
                                        fl8Var = new fl8();
                                        fl8Var.put("source", str);
                                        fl8Var.put("format", str11);
                                        fl8Var.put("pathway", "share_result");
                                        fl8Var.put("result", str4);
                                        fl8Var.put("scene", e95Var.d);
                                        str5 = e95Var.g;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        fl8Var.put("target", str5);
                                        str6 = e95Var.n;
                                        if (str6 != null) {
                                        }
                                        str7 = e95Var.o;
                                        if (str7 != null) {
                                        }
                                        fl8Var.put("$insert_id", e95Var.a);
                                        fl8VarJ = fl8Var.j();
                                    }
                                } else if (str2.equals("Card")) {
                                    str11 = "card";
                                    str3 = e95Var.h;
                                    if (pa7.t(str3, "Completed")) {
                                        if (pa7.t(str3, "Cancelled")) {
                                        }
                                    }
                                    fl8Var = new fl8();
                                    fl8Var.put("source", str);
                                    fl8Var.put("format", str11);
                                    fl8Var.put("pathway", "share_result");
                                    fl8Var.put("result", str4);
                                    fl8Var.put("scene", e95Var.d);
                                    str5 = e95Var.g;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    fl8Var.put("target", str5);
                                    str6 = e95Var.n;
                                    if (str6 != null) {
                                    }
                                    str7 = e95Var.o;
                                    if (str7 != null) {
                                    }
                                    fl8Var.put("$insert_id", e95Var.a);
                                    fl8VarJ = fl8Var.j();
                                }
                            }
                            break;
                        case 1246521297:
                            if (str10.equals("ShareButton")) {
                                str = "share_button";
                                str2 = e95Var.c;
                                iHashCode = str2.hashCode();
                                if (iHashCode != 2092848) {
                                    if (iHashCode != 2374300) {
                                        if (iHashCode == 1577017734) {
                                            str3 = e95Var.h;
                                            if (pa7.t(str3, "Completed")) {
                                                if (pa7.t(str3, "Cancelled")) {
                                                }
                                            }
                                            fl8Var = new fl8();
                                            fl8Var.put("source", str);
                                            fl8Var.put("format", str11);
                                            fl8Var.put("pathway", "share_result");
                                            fl8Var.put("result", str4);
                                            fl8Var.put("scene", e95Var.d);
                                            str5 = e95Var.g;
                                            if (str5 == null) {
                                                str5 = "";
                                            }
                                            fl8Var.put("target", str5);
                                            str6 = e95Var.n;
                                            if (str6 != null) {
                                            }
                                            str7 = e95Var.o;
                                            if (str7 != null) {
                                            }
                                            fl8Var.put("$insert_id", e95Var.a);
                                            fl8VarJ = fl8Var.j();
                                        }
                                    } else if (str2.equals("Long")) {
                                        str11 = Constants.LONG;
                                        str3 = e95Var.h;
                                        if (pa7.t(str3, "Completed")) {
                                            if (pa7.t(str3, "Cancelled")) {
                                            }
                                        }
                                        fl8Var = new fl8();
                                        fl8Var.put("source", str);
                                        fl8Var.put("format", str11);
                                        fl8Var.put("pathway", "share_result");
                                        fl8Var.put("result", str4);
                                        fl8Var.put("scene", e95Var.d);
                                        str5 = e95Var.g;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        fl8Var.put("target", str5);
                                        str6 = e95Var.n;
                                        if (str6 != null) {
                                        }
                                        str7 = e95Var.o;
                                        if (str7 != null) {
                                        }
                                        fl8Var.put("$insert_id", e95Var.a);
                                        fl8VarJ = fl8Var.j();
                                    }
                                } else if (str2.equals("Card")) {
                                    str11 = "card";
                                    str3 = e95Var.h;
                                    if (pa7.t(str3, "Completed")) {
                                        if (pa7.t(str3, "Cancelled")) {
                                        }
                                    }
                                    fl8Var = new fl8();
                                    fl8Var.put("source", str);
                                    fl8Var.put("format", str11);
                                    fl8Var.put("pathway", "share_result");
                                    fl8Var.put("result", str4);
                                    fl8Var.put("scene", e95Var.d);
                                    str5 = e95Var.g;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    fl8Var.put("target", str5);
                                    str6 = e95Var.n;
                                    if (str6 != null) {
                                    }
                                    str7 = e95Var.o;
                                    if (str7 != null) {
                                    }
                                    fl8Var.put("$insert_id", e95Var.a);
                                    fl8VarJ = fl8Var.j();
                                }
                            }
                            break;
                        case 1577017734:
                            if (str10.equals("Screenshot")) {
                                str = "screenshot";
                                str2 = e95Var.c;
                                iHashCode = str2.hashCode();
                                if (iHashCode != 2092848) {
                                    if (iHashCode != 2374300) {
                                        if (iHashCode == 1577017734) {
                                            str3 = e95Var.h;
                                            if (pa7.t(str3, "Completed")) {
                                                if (pa7.t(str3, "Cancelled")) {
                                                }
                                            }
                                            fl8Var = new fl8();
                                            fl8Var.put("source", str);
                                            fl8Var.put("format", str11);
                                            fl8Var.put("pathway", "share_result");
                                            fl8Var.put("result", str4);
                                            fl8Var.put("scene", e95Var.d);
                                            str5 = e95Var.g;
                                            if (str5 == null) {
                                                str5 = "";
                                            }
                                            fl8Var.put("target", str5);
                                            str6 = e95Var.n;
                                            if (str6 != null) {
                                            }
                                            str7 = e95Var.o;
                                            if (str7 != null) {
                                            }
                                            fl8Var.put("$insert_id", e95Var.a);
                                            fl8VarJ = fl8Var.j();
                                        }
                                    } else if (str2.equals("Long")) {
                                        str11 = Constants.LONG;
                                        str3 = e95Var.h;
                                        if (pa7.t(str3, "Completed")) {
                                            if (pa7.t(str3, "Cancelled")) {
                                            }
                                        }
                                        fl8Var = new fl8();
                                        fl8Var.put("source", str);
                                        fl8Var.put("format", str11);
                                        fl8Var.put("pathway", "share_result");
                                        fl8Var.put("result", str4);
                                        fl8Var.put("scene", e95Var.d);
                                        str5 = e95Var.g;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        fl8Var.put("target", str5);
                                        str6 = e95Var.n;
                                        if (str6 != null) {
                                        }
                                        str7 = e95Var.o;
                                        if (str7 != null) {
                                        }
                                        fl8Var.put("$insert_id", e95Var.a);
                                        fl8VarJ = fl8Var.j();
                                    }
                                } else if (str2.equals("Card")) {
                                    str11 = "card";
                                    str3 = e95Var.h;
                                    if (pa7.t(str3, "Completed")) {
                                        if (pa7.t(str3, "Cancelled")) {
                                        }
                                    }
                                    fl8Var = new fl8();
                                    fl8Var.put("source", str);
                                    fl8Var.put("format", str11);
                                    fl8Var.put("pathway", "share_result");
                                    fl8Var.put("result", str4);
                                    fl8Var.put("scene", e95Var.d);
                                    str5 = e95Var.g;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    fl8Var.put("target", str5);
                                    str6 = e95Var.n;
                                    if (str6 != null) {
                                    }
                                    str7 = e95Var.o;
                                    if (str7 != null) {
                                    }
                                    fl8Var.put("$insert_id", e95Var.a);
                                    fl8VarJ = fl8Var.j();
                                }
                            }
                            break;
                    }
                }
                if (fl8VarJ == null) {
                    z = false;
                } else {
                    x1f x1fVar = x1f.a;
                    x1f.g(new r05("card_share"), m1f.a, new c95(fl8VarJ, i2));
                }
                return Boolean.valueOf(z);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                a56 a56Var = (a56) obj;
                a56Var.getClass();
                xqc xqcVar = (xqc) this.receiver;
                xqcVar.getClass();
                s0e s0eVar2 = xqcVar.d;
                do {
                    value2 = s0eVar2.getValue();
                    lscVar = (lsc) value2;
                } while (!s0eVar2.l(value2, lscVar != null ? lsc.a(lscVar, a56Var, null, null, 62) : null));
                xqcVar.h();
                return wefVar;
            case 14:
                pu1 pu1Var = (pu1) obj;
                pu1Var.getClass();
                xqc xqcVar2 = (xqc) this.receiver;
                xqcVar2.getClass();
                s0e s0eVar3 = xqcVar2.d;
                do {
                    value3 = s0eVar3.getValue();
                    lscVar2 = (lsc) value3;
                } while (!s0eVar3.l(value3, lscVar2 != null ? lsc.a(lscVar2, null, pu1Var, null, 61) : null));
                xqcVar2.h();
                return wefVar;
            case 15:
                kpb kpbVar = (kpb) obj;
                xqc xqcVar3 = (xqc) this.receiver;
                s0e s0eVar4 = xqcVar3.d;
                do {
                    value4 = s0eVar4.getValue();
                    lscVar3 = (lsc) value4;
                } while (!s0eVar4.l(value4, lscVar3 != null ? lsc.a(lscVar3, null, null, kpbVar, 59) : null));
                xqcVar3.h();
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                wa6 wa6Var = (wa6) obj;
                wa6Var.getClass();
                s86 s86Var = (s86) this.receiver;
                s86Var.getClass();
                s0e s0eVar5 = s86Var.e;
                if (((p86) s0eVar5.getValue()).a != wa6Var) {
                    s86Var.d.e("Gift card list tab selected: tab=" + wa6Var);
                    n26 n26Var = s86Var.c;
                    n26Var.getClass();
                    db6.b1("switch_gift_card_tab", n26Var, new za6(i2, wa6Var));
                    do {
                        value5 = s0eVar5.getValue();
                    } while (!s0eVar5.l(value5, p86.a((p86) value5, wa6Var, pu4.a, false, null, 12)));
                    s86Var.f();
                }
                return wefVar;
            case 17:
                GiftCardSku giftCardSku = (GiftCardSku) obj;
                giftCardSku.getClass();
                j96 j96Var = (j96) this.receiver;
                j96Var.getClass();
                s0e s0eVar6 = j96Var.U0;
                do {
                    value6 = s0eVar6.getValue();
                    f96VarA = (f96) value6;
                    if (f96VarA.e instanceof b96) {
                        f96VarA = f96.a(f96VarA, giftCardSku, null, null, null, null, null, null, 126);
                    }
                } while (!s0eVar6.l(value6, f96VarA));
                return wefVar;
            case 18:
                String str12 = (String) obj;
                str12.getClass();
                j96 j96Var2 = (j96) this.receiver;
                j96Var2.getClass();
                s0e s0eVar7 = j96Var2.U0;
                do {
                    value7 = s0eVar7.getValue();
                    f96VarA2 = (f96) value7;
                    if (f96VarA2.e instanceof b96) {
                        f96VarA2 = f96.a(f96VarA2, null, t72.c0(str12), null, null, null, null, null, 125);
                    }
                } while (!s0eVar7.l(value7, f96VarA2));
                return wefVar;
            case 19:
                String str13 = (String) obj;
                str13.getClass();
                j96 j96Var3 = (j96) this.receiver;
                j96Var3.getClass();
                s0e s0eVar8 = j96Var3.U0;
                do {
                    value8 = s0eVar8.getValue();
                    f96VarA3 = (f96) value8;
                    if (f96VarA3.e instanceof b96) {
                        f96VarA3 = f96.a(f96VarA3, null, null, t72.c0(str13), null, null, null, null, 123);
                    }
                } while (!s0eVar8.l(value8, f96VarA3));
                return wefVar;
            case 20:
                List<md6> list = (List) obj;
                list.getClass();
                td6 td6Var = (td6) this.receiver;
                td6Var.getClass();
                for (md6 md6Var : list) {
                    if (md6Var instanceof gd6) {
                        td6Var.b(((gd6) md6Var).a);
                    } else if (md6Var instanceof kd6) {
                        ynb.V(td6Var.e, null, dw2.d, new pd6(md6Var, null), 1);
                    }
                }
                return wefVar;
            case 21:
                String str14 = (String) obj;
                str14.getClass();
                ((up9) this.receiver).getClass();
                bt5 bt5Var = new bt5(str14, 16);
                ca2.a.getClass();
                if (ca2.c) {
                    x1f x1fVar2 = x1f.a;
                    x1f.k(new r05("onboarding_channel_select"), bt5Var, 2);
                }
                return wefVar;
            case 22:
                er2 er2Var = (er2) obj;
                er2Var.getClass();
                jr2 jr2Var = (jr2) this.receiver;
                jr2Var.b.h(er2Var);
                ka9.e(jr2Var.a, AppRoute.Conversation.INSTANCE, cn1.I(new cz1(18)), 4);
                return wefVar;
            case 23:
                String str15 = (String) obj;
                str15.getClass();
                tc4 tc4Var = (tc4) this.receiver;
                tc4Var.getClass();
                return new ybc(new nd4(null, tc4Var.a, str15));
            case 24:
                h73 h73Var = (h73) obj;
                h73Var.getClass();
                kq6 kq6Var = (kq6) this.receiver;
                kq6Var.getClass();
                kq6Var.f();
                s0e s0eVar9 = kq6Var.Y;
                s0eVar9.getClass();
                s0eVar9.n(null, h73Var);
                return wefVar;
            case 25:
                String str16 = (String) obj;
                str16.getClass();
                return Boolean.valueOf(kn2.z((Context) this.receiver, str16));
            case 26:
                String str17 = (String) obj;
                str17.getClass();
                nb4 nb4Var = (nb4) this.receiver;
                nb4Var.getClass();
                return new ybc(new nd4(null, nb4Var, str17));
            case 27:
                Set set = (Set) obj;
                set.getClass();
                jb7 jb7Var = (jb7) this.receiver;
                ReentrantLock reentrantLock = jb7Var.d;
                reentrantLock.lock();
                try {
                    List<cl9> listJ1 = s72.j1(jb7Var.c.values());
                    reentrantLock.unlock();
                    for (cl9 cl9Var : listJ1) {
                        cl9Var.getClass();
                        int[] iArr = cl9Var.b;
                        int length = iArr.length;
                        Set setD = xu4.a;
                        if (length != 0) {
                            if (length != 1) {
                                o1d o1dVar = new o1d();
                                int length2 = iArr.length;
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < length2) {
                                    int i5 = i4 + 1;
                                    if (set.contains(Integer.valueOf(iArr[i3]))) {
                                        o1dVar.add(cl9Var.c[i4]);
                                    }
                                    i3++;
                                    i4 = i5;
                                }
                                setD = o1dVar.d();
                            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                                setD = cl9Var.d;
                            }
                        }
                        if (!setD.isEmpty()) {
                            cl9Var.a.a(setD);
                        }
                    }
                    return wefVar;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 28:
                ((hg7) this.receiver).n((Throwable) obj);
                return wefVar;
            default:
                xt7 xt7Var = (xt7) obj;
                xt7Var.getClass();
                return ((yt7) this.receiver).C0(xt7Var);
        }
    }
}

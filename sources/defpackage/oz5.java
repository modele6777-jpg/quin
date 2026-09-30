package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.xmind.donut.gp.GooglePay;
import tech.chatmind.api.WhereDidYouHear;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oz5 implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ oz5(lj6 lj6Var) {
        this.a = 21;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        switch (this.a) {
            case 0:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("new_user_credit_close", "popup");
                return wef.a;
            case 1:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                l1fVar2.a("new_user_credit", "btn");
                return wef.a;
            case 2:
                ((l1f) obj).a("new_user_credit", "popup");
                return wef.a;
            case 3:
                ((sn4) obj).getClass();
                return wef.a;
            case 4:
                ((my) obj).getClass();
                return kn2.c0(rw4.f(b21.T(300, 0, null, 6), 2), rw4.g(b21.T(300, 0, null, 6), 2));
            case 5:
                ((my) obj).getClass();
                return kn2.c0(rw4.f(b21.T(300, 0, null, 6), 2), rw4.g(b21.T(300, 0, null, 6), 2));
            case 6:
                ((my) obj).getClass();
                return kn2.c0(rw4.f(b21.T(300, 0, null, 6), 2), rw4.g(b21.T(300, 0, null, 6), 2));
            case 7:
                hxc hxcVar = (hxc) obj;
                hxcVar.getClass();
                wn7[] wn7VarArr = fxc.a;
                gxc gxcVar = oa7.f;
                wn7 wn7Var = fxc.a[0];
                hxcVar.c(gxcVar, Boolean.TRUE);
                return wef.a;
            case 8:
                kv2.y((l1f) obj, "popup", "gift_card_guide", "triggered_by", "active_subscription_gift_card_offer");
                return wef.a;
            case 9:
                o07 o07Var = (o07) obj;
                o07Var.getClass();
                Object obj2 = o07Var.e;
                String str = o07Var.b;
                return obj2 + ":hasOrderRef=" + (((str == null || v4e.Q(str)) ? 1 : 0) ^ 1);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((GiftCardSku) obj).getClass();
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((String) obj).getClass();
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((String) obj).getClass();
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((GiftCardSku) obj).getClass();
                return wef.a;
            case 14:
                ((String) obj).getClass();
                return wef.a;
            case 15:
                ((String) obj).getClass();
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                l1fVar3.a("gift_card_purchase_page", "pathway");
                return wef.a;
            case 17:
                synchronized (qrd.c) {
                    List list = qrd.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((a26) list.get(i)).d(obj);
                    }
                }
                return wef.a;
            case 18:
                iy9 iy9Var = (iy9) obj;
                int i2 = GooglePay.g;
                iy9Var.getClass();
                return (String) iy9Var.d();
            case 19:
                int i3 = GooglePay.g;
                String str2 = ((gwa) obj).c;
                str2.getClass();
                return str2;
            case 20:
                WhereDidYouHear whereDidYouHear = (WhereDidYouHear) obj;
                whereDidYouHear.getClass();
                return whereDidYouHear.name();
            case 21:
                p79 p79Var = (p79) obj;
                isa isaVar = lj6.c;
                long j = 0;
                for (Map.Entry entry : p79Var.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        isa isaVar2 = (isa) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strB = lj6.b(System.currentTimeMillis());
                        if (set.contains(strB)) {
                            Object[] objArr = {strB};
                            HashSet hashSet = new HashSet(1);
                            Object obj3 = objArr[0];
                            Objects.requireNonNull(obj3);
                            if (!hashSet.add(obj3)) {
                                qc0.j(ks0.j(obj3, "duplicate element: "));
                                return null;
                            }
                            p79Var.e(isaVar2, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            p79Var.d(isaVar2);
                        }
                    }
                }
                if (j == 0) {
                    p79Var.d(isaVar);
                } else {
                    p79Var.e(isaVar, Long.valueOf(j));
                }
                return null;
            case 22:
                my myVar = (my) obj;
                myVar.getClass();
                int i4 = 5;
                return myVar.d() == t91.a ? kn2.c0(rw4.n(1, new hl4(i4)).a(rw4.f(null, 3)), rw4.p(1, new oz5(23)).a(rw4.g(null, 3))) : kn2.c0(rw4.n(1, new oz5(24)).a(rw4.f(null, 3)), rw4.p(1, new hl4(i4)).a(rw4.g(null, 3)));
            case 23:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 24:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 25:
                my myVar2 = (my) obj;
                myVar2.getClass();
                int i5 = !((cn6) myVar2.d()).d.isBefore(((cn6) myVar2.b()).d) ? 1 : -1;
                xp xpVar = new xp(i5, 10);
                y6f y6fVar = rw4.a;
                hkb hkbVar = qyf.a;
                return kn2.c0(new cx4(new o3f((x95) null, new ood(b21.P(0.0f, 400.0f, 1, new w67(4294967297L)), new mw4(xpVar)), (vv1) null, (aec) null, (LinkedHashMap) null, 125)).a(rw4.f(null, 3)), new f45(new o3f((x95) null, new ood(b21.P(0.0f, 400.0f, 1, new w67(4294967297L)), new ow4(new xp(i5, 11))), (vv1) null, (aec) null, (LinkedHashMap) null, 125)).a(rw4.g(null, 3)));
            case 26:
                cn6 cn6Var = (cn6) obj;
                cn6Var.getClass();
                return cn6Var.d;
            case 27:
                kv2.y((l1f) obj, "pathway", "calendar_general", "btn", "enter_reading");
                return wef.a;
            case 28:
                l1f l1fVar4 = (l1f) obj;
                kv2.y(l1fVar4, "btn", "enter_chat", "pathway", "back_to_chat");
                l1fVar4.a("history", "page_name");
                return wef.a;
            default:
                bc4 bc4Var = (bc4) obj;
                bc4Var.getClass();
                if (bc4Var instanceof zb4) {
                    return ((zb4) bc4Var).a;
                }
                if (bc4Var instanceof ac4) {
                    return ks0.i(((ac4) bc4Var).a, "qd_");
                }
                ap.c();
                return null;
        }
    }

    public /* synthetic */ oz5(int i) {
        this.a = i;
    }
}

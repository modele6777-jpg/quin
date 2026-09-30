package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.util.Size;
import com.google.android.gms.common.api.Scope;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kv8 implements Comparator {
    public static final /* synthetic */ kv8 b = new kv8(21);
    public static final /* synthetic */ kv8 c = new kv8(26);
    public final /* synthetic */ int a;

    public /* synthetic */ kv8(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.valueOf(((long) size.getWidth()) * ((long) size.getHeight())).compareTo(Long.valueOf(((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 1:
                return i7h.m(((TarotSkinIdentify) obj).name(), ((TarotSkinIdentify) obj2).name());
            case 2:
                return i7h.m((Float) ((n17) obj2).b, (Float) ((n17) obj).b);
            case 3:
                return Integer.valueOf(((e0a) obj2).a).compareTo(Integer.valueOf(((e0a) obj).a));
            case 4:
                p07 p07VarG = ((n07) obj).g();
                Integer numValueOf = Integer.valueOf(p07VarG instanceof thb ? ((thb) p07VarG).d() : 0);
                p07 p07VarG2 = ((n07) obj2).g();
                return numValueOf.compareTo(Integer.valueOf(p07VarG2 instanceof thb ? ((thb) p07VarG2).d() : 0));
            case 5:
                return i7h.m(((z6e) obj).h().g(), ((z6e) obj2).h().g());
            case 6:
                return Long.valueOf(((File) obj2).lastModified()).compareTo(Long.valueOf(((File) obj).lastModified()));
            case 7:
                return Long.valueOf(((File) obj2).lastModified()).compareTo(Long.valueOf(((File) obj).lastModified()));
            case 8:
                ((jm9) obj2).getClass();
                Integer num = 2;
                ((jm9) obj).getClass();
                return num.compareTo(num);
            case 9:
                ((wm3) obj2).getClass();
                Integer num2 = 0;
                ((wm3) obj).getClass();
                return num2.compareTo(num2);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return i7h.m((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return i7h.m((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return Float.valueOf(((cjc) obj2).g).compareTo(Float.valueOf(((cjc) obj).g));
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return Long.valueOf(((s7a) obj).c).compareTo(Long.valueOf(((s7a) obj2).c));
            case 14:
                return Boolean.valueOf(((mmd) obj).c).compareTo(Boolean.valueOf(((mmd) obj2).c));
            case 15:
                Iterator it = ((xj1) obj).b.iterator();
                if (it.hasNext()) {
                    c3e c3eVar = (c3e) it.next();
                    List list = d3e.Y;
                    af8 af8Var = c3eVar.h;
                    list.getClass();
                    Integer numValueOf2 = Integer.valueOf(list.indexOf(af8Var));
                    while (it.hasNext()) {
                        c3e c3eVar2 = (c3e) it.next();
                        List list2 = d3e.Y;
                        af8 af8Var2 = c3eVar2.h;
                        list2.getClass();
                        Integer numValueOf3 = Integer.valueOf(list2.indexOf(af8Var2));
                        if (numValueOf2.compareTo(numValueOf3) < 0) {
                            numValueOf2 = numValueOf3;
                        }
                    }
                    Iterator it2 = ((xj1) obj2).b.iterator();
                    if (it2.hasNext()) {
                        c3e c3eVar3 = (c3e) it2.next();
                        List list3 = d3e.Y;
                        af8 af8Var3 = c3eVar3.h;
                        list3.getClass();
                        Integer numValueOf4 = Integer.valueOf(list3.indexOf(af8Var3));
                        while (it2.hasNext()) {
                            c3e c3eVar4 = (c3e) it2.next();
                            List list4 = d3e.Y;
                            af8 af8Var4 = c3eVar4.h;
                            list4.getClass();
                            Integer numValueOf5 = Integer.valueOf(list4.indexOf(af8Var4));
                            if (numValueOf4.compareTo(numValueOf5) < 0) {
                                numValueOf4 = numValueOf5;
                            }
                        }
                        return numValueOf2.compareTo(numValueOf4);
                    }
                }
                s8f.c();
                return 0;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                Iterator it3 = ((xj1) obj).b.iterator();
                if (it3.hasNext()) {
                    Integer numValueOf6 = Integer.valueOf(d3e.E0.indexOf(new y2e(((c3e) it3.next()).c)));
                    while (it3.hasNext()) {
                        Integer numValueOf7 = Integer.valueOf(d3e.E0.indexOf(new y2e(((c3e) it3.next()).c)));
                        if (numValueOf6.compareTo(numValueOf7) < 0) {
                            numValueOf6 = numValueOf7;
                        }
                    }
                    Iterator it4 = ((xj1) obj2).b.iterator();
                    if (it4.hasNext()) {
                        Integer numValueOf8 = Integer.valueOf(d3e.E0.indexOf(new y2e(((c3e) it4.next()).c)));
                        while (it4.hasNext()) {
                            Integer numValueOf9 = Integer.valueOf(d3e.E0.indexOf(new y2e(((c3e) it4.next()).c)));
                            if (numValueOf8.compareTo(numValueOf9) < 0) {
                                numValueOf8 = numValueOf9;
                            }
                        }
                        return numValueOf6.compareTo(numValueOf8);
                    }
                }
                s8f.c();
                return 0;
            case 17:
                return i7h.m((String) ((iy9) obj).d(), (String) ((iy9) obj2).d());
            case 18:
                return i7h.m(((kde) obj).a, ((kde) obj2).a);
            case 19:
                return i7h.m(((mde) obj).a, ((mde) obj2).a);
            case 20:
                return i7h.m(((rdg) obj).a, ((rdg) obj2).a);
            case 21:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 22:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 23:
                int iA = xkg.a(obj);
                int iA2 = xkg.a(obj2);
                if (iA != iA2) {
                    if (iA == 0 || iA2 == 0) {
                        throw null;
                    }
                    return iA - iA2;
                }
                int iB = kv2.B(iA);
                if (iB == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (iB == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (iB == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (iB == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            case 24:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 25:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}

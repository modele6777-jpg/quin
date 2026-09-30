package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kaf extends ub9 {
    public static final kaf r = new kaf(false, 0);
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kaf(boolean z, int i) {
        super(z);
        this.q = i;
    }

    @Override // defpackage.ub9
    public final Object a(String str, Bundle bundle) {
        switch (this.q) {
            case 0:
                bundle.getClass();
                str.getClass();
                return null;
            case 1:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z);
                }
                gdc.h(str);
                throw null;
            case 2:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                double d = bundle.getDouble(str, Double.MIN_VALUE);
                if (d != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
                    return Double.valueOf(d);
                }
                gdc.h(str);
                throw null;
            case 3:
                bundle.getClass();
                str.getClass();
                double d2 = bundle.getDouble(str, Double.MIN_VALUE);
                if (d2 != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
                    return Double.valueOf(d2);
                }
                gdc.h(str);
                throw null;
            case 4:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f);
                }
                gdc.h(str);
                throw null;
            case 5:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                return Integer.valueOf(fdc.k(str, bundle));
            case 6:
                if (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) {
                    return null;
                }
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                gdc.h(str);
                throw null;
            case 7:
                return (!ks0.y(str, str, bundle) || fdc.r(str, bundle)) ? "null" : fdc.n(str, bundle);
            case 8:
                bundle.getClass();
                str.getClass();
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                xh7 xh7Var = fzc.a;
                dd0 dd0VarL = t72.l(TarotCardChoice.Companion.serializer());
                String strDecode = Uri.decode(string);
                strDecode.getClass();
                return (List) xh7Var.b(dd0VarL, strDecode);
            case 9:
                bundle.getClass();
                str.getClass();
                String string2 = bundle.getString(str);
                if (string2 == null) {
                    return null;
                }
                xh7 xh7Var2 = fzc.a;
                dd0 dd0Var = new dd0(p4e.a, 0);
                String strDecode2 = Uri.decode(string2);
                strDecode2.getClass();
                return (List) xh7Var2.b(dd0Var, strDecode2);
            default:
                bundle.getClass();
                str.getClass();
                String string3 = bundle.getString(str);
                if (string3 == null) {
                    return null;
                }
                xh7 xh7Var3 = fzc.a;
                dd0 dd0VarL2 = t72.l(TarotCardChoice.Companion.serializer());
                String strDecode3 = Uri.decode(string3);
                strDecode3.getClass();
                return (List) xh7Var3.b(dd0VarL2, strDecode3);
        }
    }

    @Override // defpackage.ub9
    public String b() {
        switch (this.q) {
            case 0:
                return "unknown";
            case 1:
                return "boolean_nullable";
            case 2:
                return "double_nullable";
            case 3:
                return "double";
            case 4:
                return "float_nullable";
            case 5:
                return "integer_nullable";
            case 6:
                return "long_nullable";
            case 7:
                return "string_non_nullable";
            default:
                return super.b();
        }
    }

    @Override // defpackage.ub9
    public final Object d(String str) {
        switch (this.q) {
            case 0:
                return "null";
            case 1:
                if (str.equals("null")) {
                    return null;
                }
                return (Boolean) ub9.k.d(str);
            case 2:
                if (str.equals("null")) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(str));
            case 3:
                return Double.valueOf(Double.parseDouble(str));
            case 4:
                if (str.equals("null")) {
                    return null;
                }
                return Float.valueOf(Float.parseFloat(str));
            case 5:
                if (str.equals("null")) {
                    return null;
                }
                return (Integer) ub9.b.d(str);
            case 6:
                if (str.equals("null")) {
                    return null;
                }
                return (Long) ub9.e.d(str);
            case 7:
                return str;
            case 8:
                xh7 xh7Var = fzc.a;
                dd0 dd0VarL = t72.l(TarotCardChoice.Companion.serializer());
                String strDecode = Uri.decode(str);
                strDecode.getClass();
                return (List) xh7Var.b(dd0VarL, strDecode);
            case 9:
                xh7 xh7Var2 = fzc.a;
                dd0 dd0Var = new dd0(p4e.a, 0);
                String strDecode2 = Uri.decode(str);
                strDecode2.getClass();
                return (List) xh7Var2.b(dd0Var, strDecode2);
            default:
                xh7 xh7Var3 = fzc.a;
                dd0 dd0VarL2 = t72.l(TarotCardChoice.Companion.serializer());
                String strDecode3 = Uri.decode(str);
                strDecode3.getClass();
                return (List) xh7Var3.b(dd0VarL2, strDecode3);
        }
    }

    @Override // defpackage.ub9
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.q) {
            case 0:
                str.getClass();
                ((String) obj).getClass();
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                str.getClass();
                if (bool != null) {
                    ub9.k.e(bundle, str, bool);
                } else {
                    bundle.putString(str, null);
                }
                break;
            case 2:
                Double d = (Double) obj;
                str.getClass();
                if (d != null) {
                    bundle.putDouble(str, d.doubleValue());
                } else {
                    bundle.putString(str, null);
                }
                break;
            case 3:
                double dDoubleValue = ((Number) obj).doubleValue();
                str.getClass();
                bundle.putDouble(str, dDoubleValue);
                break;
            case 4:
                Float f = (Float) obj;
                str.getClass();
                if (f != null) {
                    ub9.h.e(bundle, str, f);
                } else {
                    bundle.putString(str, null);
                }
                break;
            case 5:
                Integer num = (Integer) obj;
                str.getClass();
                if (num != null) {
                    ub9.b.e(bundle, str, num);
                } else {
                    bundle.putString(str, null);
                }
                break;
            case 6:
                Long l = (Long) obj;
                str.getClass();
                if (l != null) {
                    ub9.e.e(bundle, str, l);
                } else {
                    bundle.putString(str, null);
                }
                break;
            case 7:
                String str2 = (String) obj;
                str.getClass();
                str2.getClass();
                bundle.putString(str, str2);
                break;
            case 8:
                List list = (List) obj;
                str.getClass();
                list.getClass();
                xh7 xh7Var = fzc.a;
                xh7Var.getClass();
                String strEncode = Uri.encode(xh7Var.d(new dd0(TarotCardChoice.Companion.serializer(), 0), list));
                strEncode.getClass();
                bundle.putString(str, strEncode);
                break;
            case 9:
                List list2 = (List) obj;
                str.getClass();
                list2.getClass();
                String strEncode2 = Uri.encode(fzc.a.d(new dd0(p4e.a, 0), list2));
                strEncode2.getClass();
                bundle.putString(str, strEncode2);
                break;
            default:
                List list3 = (List) obj;
                str.getClass();
                list3.getClass();
                String strEncode3 = Uri.encode(fzc.a.d(t72.l(TarotCardChoice.Companion.serializer()), list3));
                strEncode3.getClass();
                bundle.putString(str, strEncode3);
                break;
        }
    }

    @Override // defpackage.ub9
    public String f(Object obj) {
        switch (this.q) {
            case 7:
                String str = (String) obj;
                str.getClass();
                String strEncode = Uri.encode(str, null);
                strEncode.getClass();
                return strEncode;
            case 8:
                List list = (List) obj;
                list.getClass();
                xh7 xh7Var = fzc.a;
                xh7Var.getClass();
                String strEncode2 = Uri.encode(xh7Var.d(new dd0(TarotCardChoice.Companion.serializer(), 0), list));
                strEncode2.getClass();
                return strEncode2;
            case 9:
                List list2 = (List) obj;
                list2.getClass();
                String strEncode3 = Uri.encode(fzc.a.d(new dd0(p4e.a, 0), list2));
                strEncode3.getClass();
                return strEncode3;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                List list3 = (List) obj;
                list3.getClass();
                String strEncode4 = Uri.encode(fzc.a.d(t72.l(TarotCardChoice.Companion.serializer()), list3));
                strEncode4.getClass();
                return strEncode4;
            default:
                return super.f(obj);
        }
    }
}

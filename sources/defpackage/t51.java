package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t51 implements i26 {
    public final /* synthetic */ int a;

    /* JADX WARN: Code duplicated, block: B:102:0x033c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0343  */
    /* JADX WARN: Code duplicated, block: B:106:0x034d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0355  */
    /* JADX WARN: Code duplicated, block: B:109:0x0362  */
    /* JADX WARN: Code duplicated, block: B:112:0x036e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0375  */
    /* JADX WARN: Code duplicated, block: B:116:0x037f  */
    /* JADX WARN: Code duplicated, block: B:119:0x038d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0394  */
    /* JADX WARN: Code duplicated, block: B:124:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:125:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:128:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:131:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:133:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:136:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:88:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x0301  */
    /* JADX WARN: Code duplicated, block: B:91:0x030e  */
    /* JADX WARN: Code duplicated, block: B:94:0x031a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0321  */
    /* JADX WARN: Code duplicated, block: B:98:0x032b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0332  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.text.Spannable, android.text.SpannableString] */
    @Override // defpackage.i26
    public final Object apply(Object obj) {
        ?? r13;
        Bitmap bitmapDecodeByteArray;
        String str;
        float f;
        int i;
        String str2;
        int i2;
        String str3;
        float f2;
        String str4;
        int i3;
        String str5;
        float f3;
        int i4;
        String str6;
        float f4;
        String str7;
        int i5;
        boolean z;
        String str8;
        float f5;
        String str9;
        String str10;
        int i6 = 3;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                l95 l95Var = (l95) obj;
                l95Var.getClass();
                return l95Var.getClass().getSimpleName();
            case 1:
                Bundle bundle = (Bundle) obj;
                ?? charSequence = bundle.getCharSequence(t03.s);
                if (charSequence != 0) {
                    ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(t03.t);
                    if (parcelableArrayList != null) {
                        charSequence = SpannableString.valueOf(charSequence);
                        for (Bundle bundle2 : parcelableArrayList) {
                            int i7 = bundle2.getInt(p13.a);
                            int i8 = bundle2.getInt(p13.b);
                            int i9 = bundle2.getInt(p13.c);
                            int i10 = bundle2.getInt(p13.d, -1);
                            Bundle bundle3 = bundle2.getBundle(p13.e);
                            if (i10 == 1) {
                                bundle3.getClass();
                                String string = bundle3.getString(y7c.c);
                                string.getClass();
                                charSequence.setSpan(new y7c(string, bundle3.getInt(y7c.d)), i7, i8, i9);
                            } else if (i10 == 2) {
                                bundle3.getClass();
                                charSequence.setSpan(new tne(bundle3.getInt(tne.d), bundle3.getInt(tne.e), bundle3.getInt(tne.f)), i7, i8, i9);
                            } else if (i10 == i6) {
                                charSequence.setSpan(new tq6(), i7, i8, i9);
                            } else if (i10 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(azf.b);
                                string2.getClass();
                                charSequence.setSpan(new azf(string2), i7, i8, i9);
                            }
                            i6 = 3;
                        }
                    }
                } else {
                    charSequence = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(t03.u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(t03.v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(t03.w);
                if (bitmap == null) {
                    byte[] byteArray = bundle.getByteArray(t03.x);
                    if (byteArray != null) {
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                    } else {
                        r13 = charSequence;
                        bitmapDecodeByteArray = null;
                    }
                    str = t03.y;
                    if (bundle.containsKey(str)) {
                        str10 = t03.z;
                        if (bundle.containsKey(str10)) {
                            f = bundle.getFloat(str);
                            i = bundle.getInt(str10);
                        } else {
                            f = -3.4028235E38f;
                            i = Integer.MIN_VALUE;
                        }
                    } else {
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                    }
                    str2 = t03.A;
                    if (bundle.containsKey(str2)) {
                        i2 = bundle.getInt(str2);
                    } else {
                        i2 = Integer.MIN_VALUE;
                    }
                    str3 = t03.B;
                    if (bundle.containsKey(str3)) {
                        f2 = bundle.getFloat(str3);
                    } else {
                        f2 = -3.4028235E38f;
                    }
                    str4 = t03.C;
                    if (bundle.containsKey(str4)) {
                        i3 = bundle.getInt(str4);
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    str5 = t03.E;
                    if (bundle.containsKey(str5)) {
                        str9 = t03.D;
                        if (bundle.containsKey(str9)) {
                            f3 = bundle.getFloat(str5);
                            i4 = bundle.getInt(str9);
                        } else {
                            f3 = -3.4028235E38f;
                            i4 = Integer.MIN_VALUE;
                        }
                    } else {
                        f3 = -3.4028235E38f;
                        i4 = Integer.MIN_VALUE;
                    }
                    str6 = t03.F;
                    if (bundle.containsKey(str6)) {
                        f4 = bundle.getFloat(str6);
                    } else {
                        f4 = -3.4028235E38f;
                    }
                    String str11 = t03.G;
                    float f6 = bundle.containsKey(str11) ? bundle.getFloat(str11) : -3.4028235E38f;
                    str7 = t03.H;
                    if (bundle.containsKey(str7)) {
                        i5 = bundle.getInt(str7);
                    } else {
                        i5 = -16777216;
                        z2 = false;
                    }
                    int i11 = i5;
                    if (bundle.getBoolean(t03.I, false)) {
                        z = z2;
                    } else {
                        z = false;
                    }
                    String str12 = t03.J;
                    int i12 = bundle.containsKey(str12) ? bundle.getInt(str12) : Integer.MIN_VALUE;
                    str8 = t03.K;
                    if (bundle.containsKey(str8)) {
                        f5 = bundle.getFloat(str8);
                    } else {
                        f5 = 0.0f;
                    }
                    float f7 = f5;
                    String str13 = t03.L;
                    return new t03(r13, alignment2, alignment4, bitmapDecodeByteArray, f, i, i2, f2, i3, i4, f3, f4, f6, z, i11, i12, f7, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
                }
                bitmapDecodeByteArray = bitmap;
                r13 = 0;
                str = t03.y;
                if (bundle.containsKey(str)) {
                    str10 = t03.z;
                    if (bundle.containsKey(str10)) {
                        f = bundle.getFloat(str);
                        i = bundle.getInt(str10);
                    } else {
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                    }
                } else {
                    f = -3.4028235E38f;
                    i = Integer.MIN_VALUE;
                }
                str2 = t03.A;
                if (bundle.containsKey(str2)) {
                    i2 = bundle.getInt(str2);
                } else {
                    i2 = Integer.MIN_VALUE;
                }
                str3 = t03.B;
                if (bundle.containsKey(str3)) {
                    f2 = bundle.getFloat(str3);
                } else {
                    f2 = -3.4028235E38f;
                }
                str4 = t03.C;
                if (bundle.containsKey(str4)) {
                    i3 = bundle.getInt(str4);
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                str5 = t03.E;
                if (bundle.containsKey(str5)) {
                    str9 = t03.D;
                    if (bundle.containsKey(str9)) {
                        f3 = bundle.getFloat(str5);
                        i4 = bundle.getInt(str9);
                    } else {
                        f3 = -3.4028235E38f;
                        i4 = Integer.MIN_VALUE;
                    }
                } else {
                    f3 = -3.4028235E38f;
                    i4 = Integer.MIN_VALUE;
                }
                str6 = t03.F;
                if (bundle.containsKey(str6)) {
                    f4 = bundle.getFloat(str6);
                } else {
                    f4 = -3.4028235E38f;
                }
                String str14 = t03.G;
                float f8 = bundle.containsKey(str14) ? bundle.getFloat(str14) : -3.4028235E38f;
                str7 = t03.H;
                if (bundle.containsKey(str7)) {
                    i5 = bundle.getInt(str7);
                } else {
                    i5 = -16777216;
                    z2 = false;
                }
                int i13 = i5;
                if (bundle.getBoolean(t03.I, false)) {
                    z = false;
                } else {
                    z = z2;
                }
                String str15 = t03.J;
                int i14 = bundle.containsKey(str15) ? bundle.getInt(str15) : Integer.MIN_VALUE;
                str8 = t03.K;
                if (bundle.containsKey(str8)) {
                    f5 = bundle.getFloat(str8);
                } else {
                    f5 = 0.0f;
                }
                float f9 = f5;
                String str16 = t03.L;
                return new t03(r13, alignment2, alignment4, bitmapDecodeByteArray, f, i, i2, f2, i3, i4, f3, f4, f8, z, i13, i14, f9, bundle.containsKey(str16) ? bundle.getInt(str16) : 0);
            case 2:
                t03 t03Var = (t03) obj;
                Bitmap bitmap2 = t03Var.d;
                Bundle bundle4 = new Bundle();
                CharSequence charSequence2 = t03Var.a;
                if (charSequence2 != null) {
                    bundle4.putCharSequence(t03.s, charSequence2);
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence2;
                        String str17 = p13.a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (y7c y7cVar : (y7c[]) spanned.getSpans(0, spanned.length(), y7c.class)) {
                            y7cVar.getClass();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(y7c.c, y7cVar.a);
                            bundle5.putInt(y7c.d, y7cVar.b);
                            arrayList.add(p13.a(spanned, y7cVar, 1, bundle5));
                        }
                        for (tne tneVar : (tne[]) spanned.getSpans(0, spanned.length(), tne.class)) {
                            tneVar.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(tne.d, tneVar.a);
                            bundle6.putInt(tne.e, tneVar.b);
                            bundle6.putInt(tne.f, tneVar.c);
                            arrayList.add(p13.a(spanned, tneVar, 2, bundle6));
                        }
                        for (tq6 tq6Var : (tq6[]) spanned.getSpans(0, spanned.length(), tq6.class)) {
                            arrayList.add(p13.a(spanned, tq6Var, 3, null));
                        }
                        for (azf azfVar : (azf[]) spanned.getSpans(0, spanned.length(), azf.class)) {
                            azfVar.getClass();
                            Bundle bundle7 = new Bundle();
                            bundle7.putString(azf.b, azfVar.a);
                            arrayList.add(p13.a(spanned, azfVar, 4, bundle7));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle4.putParcelableArrayList(t03.t, arrayList);
                        }
                    }
                }
                bundle4.putSerializable(t03.u, t03Var.b);
                bundle4.putSerializable(t03.v, t03Var.c);
                bundle4.putFloat(t03.y, t03Var.e);
                bundle4.putInt(t03.z, t03Var.f);
                bundle4.putInt(t03.A, t03Var.g);
                bundle4.putFloat(t03.B, t03Var.h);
                bundle4.putInt(t03.C, t03Var.i);
                bundle4.putInt(t03.D, t03Var.n);
                bundle4.putFloat(t03.E, t03Var.o);
                bundle4.putFloat(t03.F, t03Var.j);
                bundle4.putFloat(t03.G, t03Var.k);
                bundle4.putBoolean(t03.I, t03Var.l);
                bundle4.putInt(t03.H, t03Var.m);
                bundle4.putInt(t03.J, t03Var.p);
                bundle4.putFloat(t03.K, t03Var.q);
                bundle4.putInt(t03.L, t03Var.r);
                if (bitmap2 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    pa7.J(bitmap2.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle4.putByteArray(t03.x, byteArrayOutputStream.toByteArray());
                }
                return bundle4;
            case 3:
                return Integer.valueOf(((t03) obj).r);
            case 4:
                long j = ((w03) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 5:
                return new ro3((ece) obj);
            case 6:
                fu7 fu7Var = (fu7) obj;
                return fu7Var.a + ": " + fu7Var.b;
            case 7:
                return (d1f) obj;
            case 8:
                return Long.valueOf(((w03) obj).b);
            case 9:
                return Long.valueOf(((w03) obj).c);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return jy6.o(tq.P(((up8) obj).m().b, new t51(12)));
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return (d1f) obj;
            default:
                return Integer.valueOf(((h1f) obj).c);
        }
    }

    public /* synthetic */ t51(int i) {
        this.a = i;
    }
}

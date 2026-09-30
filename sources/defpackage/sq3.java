package defpackage;

import android.net.Uri;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sq3 implements o95 {
    public static final int[] f = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final k47 g = new k47(new oo3(20));
    public static final k47 v = new k47(new oo3(21));
    public int a;
    public yob b;
    public qfc c = new qfc();
    public int d;
    public int e;

    public final void a(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new a6());
                break;
            case 1:
                arrayList.add(new c6());
                break;
            case 2:
                arrayList.add(new rh());
                break;
            case 3:
                arrayList.add(new bk());
                break;
            case 4:
                l95 l95VarB = g.B(0);
                if (l95VarB == null) {
                    arrayList.add(new zh5());
                } else {
                    arrayList.add(l95VarB);
                }
                break;
            case 5:
                arrayList.add(new jn5());
                break;
            case 6:
                arrayList.add(new en8(this.c, 0));
                break;
            case 7:
                arrayList.add(new i49(this.a));
                break;
            case 8:
                arrayList.add(new py5(this.c, 704));
                arrayList.add(new q49(this.c, 160));
                break;
            case 9:
                arrayList.add(new xl9());
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                arrayList.add(new i2b());
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (this.b == null) {
                    ey6 ey6Var = jy6.b;
                    this.b = yob.e;
                }
                arrayList.add(new v5f(0, this.c, new rye(0L), new bu3(this.b)));
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                arrayList.add(new b0g());
                break;
            case 14:
                arrayList.add(new nj6(this.d, 1));
                break;
            case 15:
                l95 l95VarB2 = v.B(new Object[0]);
                if (l95VarB2 != null) {
                    arrayList.add(l95VarB2);
                }
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                arrayList.add(new jr0(0, this.c));
                break;
            case 17:
                arrayList.add(new v01(1));
                break;
            case 18:
                arrayList.add(new mr0(1));
                break;
            case 19:
                arrayList.add(new v01(0));
                break;
            case 20:
                arrayList.add(new nj6(this.e, 0));
                break;
            case 21:
                arrayList.add(new mr0(0));
                break;
        }
    }

    @Override // defpackage.o95
    public final synchronized l95[] d() {
        return e(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0240 A[Catch: all -> 0x0244, TRY_ENTER, TryCatch #0 {all -> 0x0244, blocks: (B:4:0x0003, B:6:0x0019, B:9:0x0020, B:169:0x0240, B:172:0x0246, B:175:0x024e, B:178:0x0254, B:181:0x025a, B:182:0x025d, B:183:0x0260, B:14:0x002d), top: B:188:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x0254 A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:4:0x0003, B:6:0x0019, B:9:0x0020, B:169:0x0240, B:172:0x0246, B:175:0x024e, B:178:0x0254, B:181:0x025a, B:182:0x025d, B:183:0x0260, B:14:0x002d), top: B:188:0x0003 }] */
    /* JADX WARN: switch over string: strings are not added: [[image/heic], [image/heif]] */
    @Override // defpackage.o95
    public final synchronized l95[] e(Uri uri, Map map) {
        ArrayList arrayList;
        int i;
        int iP;
        int i2;
        int i3;
        try {
            int[] iArr = f;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
            if (str != null) {
                String strL = qv8.l(str);
                strL.getClass();
                i = 20;
                switch (strL) {
                    case "audio/eac3-joc":
                    case "audio/ac3":
                    case "audio/eac3":
                        i = 0;
                        break;
                    case "video/mp2p":
                        i = 10;
                        break;
                    case "video/mp2t":
                        i = 11;
                        break;
                    case "video/webm":
                    case "audio/x-matroska":
                    case "application/webm":
                    case "audio/webm":
                    case "video/x-matroska":
                        i = 6;
                        break;
                    case "audio/amr-wb":
                    case "audio/amr":
                    case "audio/3gpp":
                        i = 3;
                        break;
                    case "image/avif":
                        i = 21;
                        break;
                    case "image/jpeg":
                        i = 14;
                        break;
                    case "image/webp":
                        i = 18;
                        break;
                    case "application/mp4":
                    case "audio/mp4":
                    case "video/mp4":
                        i = 8;
                        break;
                    case "video/x-msvideo":
                        i = 16;
                        break;
                    case "text/vtt":
                        i = 13;
                        break;
                    case "image/bmp":
                        i = 19;
                        break;
                    case "image/png":
                        i = 17;
                        break;
                    case "video/x-flv":
                        i = 5;
                        break;
                    case "audio/ac4":
                        i = 1;
                        break;
                    case "audio/ogg":
                        i = 9;
                        break;
                    case "audio/wav":
                        i = 12;
                        break;
                    case "audio/flac":
                        i = 4;
                        break;
                    case "audio/midi":
                        i = 15;
                        break;
                    case "audio/mpeg":
                        i = 7;
                        break;
                }
                if (i != -1) {
                    a(i, arrayList);
                }
                iP = kn2.P(uri);
                if (iP != -1 && iP != i) {
                    a(iP, arrayList);
                }
                for (i2 = 0; i2 < 21; i2++) {
                    i3 = iArr[i2];
                    if (i3 == i && i3 != iP) {
                        a(i3, arrayList);
                    }
                }
            }
            i = -1;
            if (i != -1) {
                a(i, arrayList);
            }
            iP = kn2.P(uri);
            if (iP != -1) {
                a(iP, arrayList);
            }
            while (i2 < 21) {
                i3 = iArr[i2];
                if (i3 == i) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (l95[]) arrayList.toArray(new l95[0]);
    }
}

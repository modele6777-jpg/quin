package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fte extends ru6 {
    public final String b;
    public final jy6 c;

    public fte(String str, String str2, yob yobVar) {
        super(str);
        pa7.A(!yobVar.isEmpty());
        this.b = str2;
        jy6 jy6VarO = jy6.o(yobVar);
        this.c = jy6VarO;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override // defpackage.qu8
    public final void b(r23 r23Var) {
        byte b;
        Integer numValueOf;
        switch (this.a) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TCON":
                b = 12;
                break;
            case "TDAT":
                b = 13;
                break;
            case "TDRC":
                b = 14;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = 19;
                break;
            case "TPE3":
                b = 20;
                break;
            case "TPOS":
                b = 21;
                break;
            case "TRCK":
                b = 22;
                break;
            case "TSST":
                b = 23;
                break;
            case "TYER":
                b = 24;
                break;
            default:
                b = -1;
                break;
        }
        jy6 jy6Var = this.c;
        try {
            switch (b) {
                case 0:
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    r23Var.c = (CharSequence) jy6Var.get(0);
                    break;
                case 1:
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    r23Var.s = (CharSequence) jy6Var.get(0);
                    break;
                case 2:
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    String str = (String) jy6Var.get(0);
                    int i = Integer.parseInt(str.substring(2, 4));
                    int i2 = Integer.parseInt(str.substring(0, 2));
                    r23Var.m = Integer.valueOf(i);
                    r23Var.n = Integer.valueOf(i2);
                    break;
                case 3:
                case 18:
                    r23Var.b = (CharSequence) jy6Var.get(0);
                    break;
                case 4:
                case 19:
                    r23Var.d = (CharSequence) jy6Var.get(0);
                    break;
                case 5:
                case 20:
                    r23Var.t = (CharSequence) jy6Var.get(0);
                    break;
                case 6:
                case 22:
                    String str2 = (String) jy6Var.get(0);
                    String str3 = pqf.a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    r23Var.h = Integer.valueOf(i3);
                    r23Var.i = numValueOf;
                    break;
                case 7:
                case 17:
                    r23Var.a = (CharSequence) jy6Var.get(0);
                    break;
                case 8:
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    r23Var.r = (CharSequence) jy6Var.get(0);
                    break;
                case 9:
                case 24:
                    r23Var.l = Integer.valueOf(Integer.parseInt((String) jy6Var.get(0)));
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    Integer numA0 = rxg.a0((String) jy6Var.get(0));
                    if (numA0 != null) {
                        String strA = su6.a(numA0.intValue());
                        if (strA != null) {
                            r23Var.x = strA;
                        }
                    } else {
                        r23Var.x = (CharSequence) jy6Var.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d((String) jy6Var.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                r23Var.n = (Integer) arrayListD.get(2);
                            }
                        }
                        r23Var.m = (Integer) arrayListD.get(1);
                    }
                    r23Var.l = (Integer) arrayListD.get(0);
                    break;
                case 15:
                    ArrayList arrayListD2 = d((String) jy6Var.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                r23Var.q = (Integer) arrayListD2.get(2);
                            }
                        }
                        r23Var.p = (Integer) arrayListD2.get(1);
                    }
                    r23Var.o = (Integer) arrayListD2.get(0);
                    break;
                case 21:
                    String str4 = (String) jy6Var.get(0);
                    String str5 = pqf.a;
                    String[] strArrSplit2 = str4.split("/", -1);
                    int i4 = Integer.parseInt(strArrSplit2[0]);
                    numValueOf = strArrSplit2.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit2[1])) : null;
                    r23Var.v = Integer.valueOf(i4);
                    r23Var.w = numValueOf;
                    break;
                case 23:
                    r23Var.u = (CharSequence) jy6Var.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fte.class != obj.getClass()) {
            return false;
        }
        fte fteVar = (fte) obj;
        return this.a.equals(fteVar.a) && Objects.equals(this.b, fteVar.b) && this.c.equals(fteVar.c);
    }

    public final int hashCode() {
        int iC = ub3.c(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.ru6
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}

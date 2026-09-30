package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zqe extends gbe implements l26 {
    int label;
    final /* synthetic */ cre this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqe(cre creVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = creVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new zqe(this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:177:0x0355  */
    /* JADX WARN: Code duplicated, block: B:180:0x035e  */
    /* JADX WARN: Code duplicated, block: B:55:0x013a  */
    /* JADX WARN: Code duplicated, block: B:57:0x013f  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a3  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object objB;
        bw2 bw2Var;
        Object k00Var;
        CharSequence text;
        long j;
        long j2;
        long jR;
        int i;
        k00 k00Var2;
        cre creVar;
        int i2 = this.label;
        wef wefVar = wef.a;
        byte b = 1;
        bw2 bw2Var2 = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            c52 c52Var = this.this$0.g;
            if (c52Var != null) {
                this.label = 1;
                objB = c52Var.b(this);
                if (objB == bw2Var2) {
                    return bw2Var2;
                }
            }
            return wefVar;
        }
        if (i2 == 1) {
            jzb.q(obj);
            objB = obj;
        } else {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            k00Var = obj;
        }
        k00Var2 = (k00) k00Var;
        if (k00Var2 != null) {
            creVar = this.this$0;
            if (creVar.h()) {
                i00 i00Var = new i00(arb.l(creVar.l(), creVar.l().a.b.length()));
                i00Var.d(k00Var2);
                k00 k00VarL = i00Var.l();
                k00 k00VarK = arb.k(creVar.l(), creVar.l().a.b.length());
                i00 i00Var2 = new i00(k00VarL);
                i00Var2.d(k00VarK);
                k00 k00VarL2 = i00Var2.l();
                int length = k00Var2.b.length() + eue.g(creVar.l().b);
                creVar.c.d(cre.b(k00VarL2, u3c.b(length, length)));
                creVar.r(ug6.a);
                creVar.a.e = true;
            }
        }
        return wefVar;
        a52 a52Var = (a52) objB;
        if (a52Var != null) {
            this.label = 2;
            int i3 = 0;
            ClipData.Item itemAt = a52Var.a.getItemAt(0);
            if (itemAt == null || (text = itemAt.getText()) == null) {
                bw2Var = bw2Var2;
                k00Var = null;
            } else if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                ArrayList arrayList = new ArrayList();
                annotationArr.getClass();
                int length2 = annotationArr.length - 1;
                if (length2 >= 0) {
                    int i4 = 0;
                    while (true) {
                        Annotation annotation = annotationArr[i4];
                        if (pa7.t(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                            int spanStart = spanned.getSpanStart(annotation);
                            int spanEnd = spanned.getSpanEnd(annotation);
                            String value = annotation.getValue();
                            Parcel parcelObtain = Parcel.obtain();
                            byte[] bArrDecode = Base64.decode(value, i3);
                            parcelObtain.unmarshall(bArrDecode, i3, bArrDecode.length);
                            parcelObtain.setDataPosition(i3);
                            long j3 = y72.k;
                            long j4 = j3;
                            long j5 = wue.c;
                            long jR2 = j5;
                            ar5 ar5Var = null;
                            wq5 wq5Var = null;
                            xq5 xq5Var = null;
                            String string = null;
                            ou0 ou0Var = null;
                            cte cteVar = null;
                            mne mneVar = null;
                            o4d o4dVar = null;
                            while (true) {
                                if (parcelObtain.dataAvail() > b) {
                                    byte b2 = parcelObtain.readByte();
                                    if (b2 != b) {
                                        i3 = i3;
                                        spanned = spanned;
                                        if (b2 != 2) {
                                            bw2Var2 = bw2Var2;
                                            if (b2 == 3) {
                                                if (parcelObtain.dataAvail() < 4) {
                                                    break;
                                                }
                                                ar5Var = new ar5(parcelObtain.readInt());
                                                bw2Var2 = bw2Var2;
                                                b = 1;
                                            } else if (b2 == 4) {
                                                if (parcelObtain.dataAvail() < 1) {
                                                    break;
                                                }
                                                byte b3 = parcelObtain.readByte();
                                                wq5Var = new wq5((b3 != 0 && b3 == 1) ? 1 : i3);
                                                b = 1;
                                                spanned = spanned;
                                                bw2Var2 = bw2Var2;
                                                i3 = i3;
                                            } else if (b2 != 5) {
                                                if (b2 == 6) {
                                                    string = parcelObtain.readString();
                                                } else if (b2 == 7) {
                                                    if (parcelObtain.dataAvail() < 5) {
                                                        break;
                                                    }
                                                    byte b4 = parcelObtain.readByte();
                                                    long j6 = b4 == 1 ? 4294967296L : b4 == 2 ? 8589934592L : 0L;
                                                    jR2 = xue.a(j6, 0L) ? wue.c : w6c.r(j6, parcelObtain.readFloat());
                                                } else if (b2 == 8) {
                                                    if (parcelObtain.dataAvail() < 4) {
                                                        break;
                                                    }
                                                    ou0Var = new ou0(parcelObtain.readFloat());
                                                    bw2Var2 = bw2Var2;
                                                    b = 1;
                                                } else if (b2 == 9) {
                                                    if (parcelObtain.dataAvail() < 8) {
                                                        break;
                                                    }
                                                    cteVar = new cte(parcelObtain.readFloat(), parcelObtain.readFloat());
                                                    bw2Var2 = bw2Var2;
                                                    b = 1;
                                                } else if (b2 == 10) {
                                                    if (parcelObtain.dataAvail() < 8) {
                                                        break;
                                                    }
                                                    int i5 = y72.l;
                                                    long j7 = parcelObtain.readLong();
                                                    long j8 = j7 & 63;
                                                    if (j8 >= 16) {
                                                        j7 = (j7 & (-64)) | (j8 + 1);
                                                    }
                                                    j4 = j7;
                                                } else if (b2 != 11) {
                                                    if (b2 == 12) {
                                                        if (parcelObtain.dataAvail() < 20) {
                                                            break;
                                                        }
                                                        int i6 = y72.l;
                                                        long j9 = parcelObtain.readLong();
                                                        long j10 = j9 & 63;
                                                        if (j10 >= 16) {
                                                            j9 = (j9 & (-64)) | (j10 + 1);
                                                        }
                                                        i3 = i3;
                                                        bw2Var2 = bw2Var2;
                                                        o4dVar = new o4d(j9, (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) & 4294967295L), parcelObtain.readFloat());
                                                    }
                                                    b = 1;
                                                } else {
                                                    if (parcelObtain.dataAvail() < 4) {
                                                        break;
                                                    }
                                                    int i7 = parcelObtain.readInt();
                                                    int i8 = (i7 & 2) != 0 ? 1 : i3;
                                                    int i9 = (i7 & 1) != 0 ? 1 : i3;
                                                    mne mneVar2 = mne.d;
                                                    mne mneVar3 = mne.c;
                                                    if (i8 != 0 && i9 != 0) {
                                                        List listI = t72.I(mneVar2, mneVar3);
                                                        Integer numValueOf = Integer.valueOf(i3);
                                                        int size = listI.size();
                                                        for (int i10 = i3; i10 < size; i10++) {
                                                            numValueOf = Integer.valueOf(numValueOf.intValue() | ((mne) listI.get(i10)).a);
                                                        }
                                                        mneVar2 = new mne(numValueOf.intValue());
                                                    } else if (i8 == 0) {
                                                        mneVar = i9 != 0 ? mneVar3 : mne.b;
                                                    }
                                                    mneVar = mneVar2;
                                                }
                                                bw2Var2 = bw2Var2;
                                                b = 1;
                                            } else {
                                                if (parcelObtain.dataAvail() < 1) {
                                                    break;
                                                }
                                                byte b5 = parcelObtain.readByte();
                                                if (b5 == 0) {
                                                    i = i3;
                                                } else if (b5 == 1) {
                                                    i = 65535;
                                                } else if (b5 == 3) {
                                                    i = 2;
                                                } else if (b5 == 2) {
                                                    i = 1;
                                                } else {
                                                    i = i3;
                                                }
                                                xq5Var = new xq5(i);
                                                bw2Var2 = bw2Var2;
                                                b = 1;
                                            }
                                        } else {
                                            if (parcelObtain.dataAvail() < 5) {
                                                bw2Var2 = bw2Var2;
                                                break;
                                            }
                                            byte b6 = parcelObtain.readByte();
                                            if (b6 == b) {
                                                j2 = 4294967296L;
                                            } else {
                                                if (b6 == 2) {
                                                    j2 = 8589934592L;
                                                } else {
                                                    bw2Var2 = bw2Var2;
                                                    j = 0;
                                                    j2 = 0;
                                                }
                                                if (xue.a(j2, j)) {
                                                    jR = wue.c;
                                                } else {
                                                    jR = w6c.r(j2, parcelObtain.readFloat());
                                                }
                                                j5 = jR;
                                                bw2Var2 = bw2Var2;
                                                b = 1;
                                            }
                                            j = 0;
                                            if (xue.a(j2, j)) {
                                                jR = wue.c;
                                            } else {
                                                jR = w6c.r(j2, parcelObtain.readFloat());
                                            }
                                            j5 = jR;
                                            bw2Var2 = bw2Var2;
                                            b = 1;
                                        }
                                        k00Var2 = (k00) k00Var;
                                        if (k00Var2 != null) {
                                            creVar = this.this$0;
                                            if (creVar.h()) {
                                                i00 i00Var3 = new i00(arb.l(creVar.l(), creVar.l().a.b.length()));
                                                i00Var3.d(k00Var2);
                                                k00 k00VarL3 = i00Var3.l();
                                                k00 k00VarK2 = arb.k(creVar.l(), creVar.l().a.b.length());
                                                i00 i00Var4 = new i00(k00VarL3);
                                                i00Var4.d(k00VarK2);
                                                k00 k00VarL4 = i00Var4.l();
                                                int length3 = k00Var2.b.length() + eue.g(creVar.l().b);
                                                creVar.c.d(cre.b(k00VarL4, u3c.b(length3, length3)));
                                                creVar.r(ug6.a);
                                                creVar.a.e = true;
                                            }
                                        }
                                    } else if (parcelObtain.dataAvail() >= 8) {
                                        int i11 = y72.l;
                                        long j11 = parcelObtain.readLong();
                                        long j12 = j11 & 63;
                                        j3 = j12 < 16 ? j11 : (j11 & (-64)) | (j12 + 1);
                                    }
                                }
                                bw2Var2 = bw2Var2;
                                i3 = i3;
                                spanned = spanned;
                                break;
                            }
                            arrayList.add(new j00(new xtd(j3, j5, ar5Var, wq5Var, xq5Var, null, string, jR2, ou0Var, cteVar, null, j4, mneVar, o4dVar, 49152), spanStart, spanEnd));
                        } else {
                            bw2Var2 = bw2Var2;
                            i3 = i3;
                            spanned = spanned;
                        }
                        if (i4 == length2) {
                            break;
                        }
                        i4++;
                        i3 = i3;
                        spanned = spanned;
                        bw2Var2 = bw2Var2;
                        b = 1;
                    }
                } else {
                    bw2Var2 = bw2Var2;
                }
                String string2 = text.toString();
                k00 k00Var3 = l00.a;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                k00Var = new k00(arrayList, string2);
                bw2Var = bw2Var2;
            } else {
                k00Var = new k00(text.toString());
                bw2Var = bw2Var2;
            }
            if (k00Var == bw2Var) {
                return bw2Var;
            }
            k00Var2 = (k00) k00Var;
            if (k00Var2 != null) {
                creVar = this.this$0;
                if (creVar.h()) {
                    i00 i00Var5 = new i00(arb.l(creVar.l(), creVar.l().a.b.length()));
                    i00Var5.d(k00Var2);
                    k00 k00VarL5 = i00Var5.l();
                    k00 k00VarK3 = arb.k(creVar.l(), creVar.l().a.b.length());
                    i00 i00Var6 = new i00(k00VarL5);
                    i00Var6.d(k00VarK3);
                    k00 k00VarL6 = i00Var6.l();
                    int length4 = k00Var2.b.length() + eue.g(creVar.l().b);
                    creVar.c.d(cre.b(k00VarL6, u3c.b(length4, length4)));
                    creVar.r(ug6.a);
                    creVar.a.e = true;
                }
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zqe) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

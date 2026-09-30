package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n8a implements Parcelable {
    public static final Parcelable.Creator<n8a> CREATOR = new rz9(4);
    public final String a;
    public final oye b;
    public boolean c;

    public n8a(Parcel parcel) {
        this.c = false;
        this.a = parcel.readString();
        this.c = parcel.readByte() != 0;
        this.b = (oye) parcel.readParcelable(oye.class.getClassLoader());
    }

    public static m8a[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        m8a[] m8aVarArr = new m8a[list.size()];
        m8a m8aVarA = ((n8a) list.get(0)).a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            m8a m8aVarA2 = ((n8a) list.get(i)).a();
            if (z || !((n8a) list.get(i)).c) {
                m8aVarArr[i] = m8aVarA2;
            } else {
                m8aVarArr[0] = m8aVarA2;
                m8aVarArr[i] = m8aVarA;
                z = true;
            }
        }
        if (!z) {
            m8aVarArr[0] = m8aVarA;
        }
        return m8aVarArr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    public static n8a c(String str) {
        boolean z;
        kj2 kj2Var;
        ur9 ur9Var;
        ur9 ur9VarB;
        double dDoubleValue;
        n8a n8aVar = new n8a(str.replace("-", ""), new i8c(18));
        ji2 ji2VarE = ji2.e();
        if (ji2VarE.n()) {
            double dRandom = Math.random();
            synchronized (kj2.class) {
                kj2Var = kj2.l;
                if (kj2Var == null) {
                    kj2Var = new kj2();
                    kj2.l = kj2Var;
                }
            }
            ur9 ur9VarH = ji2VarE.h(kj2Var);
            if (ur9VarH.b()) {
                dDoubleValue = ((Double) ur9VarH.a()).doubleValue() / 100.0d;
                if (!ji2.o(dDoubleValue)) {
                    ur9Var = ji2VarE.a.getDouble("fpr_vc_session_sampling_rate");
                    if (ur9Var.b() || !ji2.o(((Double) ur9Var.a()).doubleValue())) {
                        ur9VarB = ji2VarE.b(kj2Var);
                        if (!ur9VarB.b() && ji2.o(((Double) ur9VarB.a()).doubleValue())) {
                            dDoubleValue = ((Double) ur9VarB.a()).doubleValue();
                        } else if (ji2VarE.a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else {
                        ji2VarE.c.e("com.google.firebase.perf.SessionSamplingRate", ((Double) ur9Var.a()).doubleValue());
                        dDoubleValue = ((Double) ur9Var.a()).doubleValue();
                    }
                }
            } else {
                ur9Var = ji2VarE.a.getDouble("fpr_vc_session_sampling_rate");
                if (ur9Var.b()) {
                    ur9VarB = ji2VarE.b(kj2Var);
                    if (!ur9VarB.b()) {
                        if (ji2VarE.a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (ji2VarE.a.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                } else {
                    ur9VarB = ji2VarE.b(kj2Var);
                    if (!ur9VarB.b()) {
                        if (ji2VarE.a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (ji2VarE.a.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                }
            }
            if (dRandom < dDoubleValue) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        n8aVar.c = z;
        return n8aVar;
    }

    public final m8a a() {
        l8a l8aVarU = m8a.u();
        l8aVarU.i();
        ((m8a) l8aVarU.b).v(this.a);
        if (this.c) {
            l8aVarU.i();
            ((m8a) l8aVarU.b).r();
        }
        return (m8a) l8aVarU.h();
    }

    public final boolean d() {
        hj2 hj2Var;
        long jLongValue;
        long jB = this.b.b() / 60000000;
        ji2 ji2VarE = ji2.e();
        ji2VarE.getClass();
        synchronized (hj2.class) {
            hj2Var = hj2.l;
            if (hj2Var == null) {
                hj2Var = new hj2();
                hj2.l = hj2Var;
            }
        }
        ur9 ur9VarI = ji2VarE.i(hj2Var);
        if (!ur9VarI.b() || ((Long) ur9VarI.a()).longValue() <= 0) {
            ur9 ur9Var = ji2VarE.a.getLong("fpr_session_max_duration_min");
            if (!ur9Var.b() || ((Long) ur9Var.a()).longValue() <= 0) {
                ur9 ur9VarC = ji2VarE.c(hj2Var);
                jLongValue = (!ur9VarC.b() || ((Long) ur9VarC.a()).longValue() <= 0) ? 240L : ((Long) ur9VarC.a()).longValue();
            } else {
                ji2VarE.c.d(((Long) ur9Var.a()).longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                jLongValue = ((Long) ur9Var.a()).longValue();
            }
        } else {
            jLongValue = ((Long) ur9VarI.a()).longValue();
        }
        return jB > jLongValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.b, 0);
    }

    public n8a(String str, i8c i8cVar) {
        this.c = false;
        this.a = str;
        this.b = new oye();
    }
}

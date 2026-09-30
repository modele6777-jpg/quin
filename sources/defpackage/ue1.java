package defpackage;

import android.os.Parcel;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class ue1 implements ypb {
    public final String a;

    public ue1(String str, int i) {
        switch (i) {
            case 1:
                str.getClass();
                this.a = str;
                break;
            case 4:
                this.a = kv2.h(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
                break;
            default:
                str.getClass();
                this.a = str;
                break;
        }
    }

    public static CharSequence c(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                b1.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = ub3.k(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return ib8.j(str, " : ", str2);
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(c(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    sb.append(c(it.next()));
                }
            }
        } catch (IOException e) {
            qc0.i(e);
        }
    }

    @Override // defpackage.ypb
    public void accept(Object obj, Object obj2) {
        int i = w6h.l;
        i6h i6hVar = new i6h((gle) obj2);
        d7h d7hVar = (d7h) ((g7h) obj).l();
        Parcel parcelJ = d7hVar.J();
        lsg.c(parcelJ, i6hVar);
        parcelJ.writeString(this.a);
        parcelJ.writeString("");
        parcelJ.writeString(null);
        d7hVar.K(parcelJ, 11);
    }

    public String b(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", f(this.a, str, objArr));
        }
    }

    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            b1.l("PlayCore", f(this.a, str, objArr));
        }
    }
}

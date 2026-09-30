package io.sentry.vendor.gson.stream;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.qc0;
import defpackage.s8f;
import defpackage.yg5;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Closeable, Flushable {
    public static final String[] w = new String[UserMetadata.MAX_ROLLOUT_ASSIGNMENTS];
    public final Writer a;
    public int[] b;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    public final boolean v;

    static {
        for (int i = 0; i <= 31; i++) {
            w[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = w;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArrCopyOf = new int[8];
        this.b = iArrCopyOf;
        this.c = 0;
        if (iArrCopyOf.length == 0) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, 0);
            this.b = iArrCopyOf;
        }
        int i = this.c;
        this.c = i + 1;
        iArrCopyOf[i] = 6;
        this.e = ":";
        this.v = true;
        this.a = writer;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    public final void E(String str) throws IOException {
        String str2;
        Writer writer = this.a;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = w[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        writer.write(str, i, i2 - i);
                    }
                    writer.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    public final void G() {
        if (this.g != null) {
            int iX = x();
            if (iX == 5) {
                this.a.write(44);
            } else if (iX != 3) {
                qc0.p("Nesting problem.");
                return;
            }
            l();
            this.b[this.c - 1] = 4;
            E(this.g);
            this.g = null;
        }
    }

    public final void b() {
        int iX = x();
        if (iX == 1) {
            this.b[this.c - 1] = 2;
            l();
            return;
        }
        Writer writer = this.a;
        if (iX == 2) {
            writer.append(',');
            l();
            return;
        }
        if (iX == 4) {
            writer.append((CharSequence) this.e);
            this.b[this.c - 1] = 5;
            return;
        }
        if (iX != 6) {
            if (iX != 7) {
                qc0.p("Nesting problem.");
                return;
            } else if (!this.f) {
                qc0.p("JSON must have only one top-level value.");
                return;
            }
        }
        this.b[this.c - 1] = 7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
        int i = this.c;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            yg5.m("Incomplete document");
        } else {
            this.c = 0;
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.c != 0) {
            this.a.flush();
        } else {
            qc0.p("JsonWriter is closed.");
        }
    }

    public final void h(int i, int i2, char c) {
        int iX = x();
        if (iX != i2 && iX != i) {
            qc0.p("Nesting problem.");
            return;
        }
        if (this.g != null) {
            s8f.h(this.g, "Dangling name: ");
            return;
        }
        this.c--;
        if (iX == i2) {
            l();
        }
        this.a.write(c);
    }

    public final void l() throws IOException {
        if (this.d == null) {
            return;
        }
        Writer writer = this.a;
        writer.write(10);
        int i = this.c;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.d);
        }
    }

    public final void u() {
        if (this.g != null) {
            if (!this.v) {
                this.g = null;
                return;
            }
            G();
        }
        b();
        this.a.write("null");
    }

    public final int x() {
        int i = this.c;
        if (i != 0) {
            return this.b[i - 1];
        }
        qc0.p("JsonWriter is closed.");
        return 0;
    }
}

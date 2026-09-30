package defpackage;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xg3 implements syf {
    public int a;
    public int b;
    public int c;
    public final Object d;
    public Object e;

    public xg3(ArrayList arrayList) {
        this.e = new std("", null);
        this.c = 0;
        this.d = arrayList;
        this.a = 0;
        this.b = 0;
        if (arrayList.isEmpty()) {
            return;
        }
        b(0, 0);
        std stdVar = (std) arrayList.get(0);
        this.e = stdVar;
        this.c = stdVar.a.length();
    }

    @Override // defpackage.syf
    public w2f a(k00 k00Var) {
        int length = k00Var.b.length();
        int i = this.c;
        String strSubstring = k00Var.b;
        int i2 = 0;
        if (length > i) {
            z67 z67VarC0 = mh3.c0(0, i);
            strSubstring.getClass();
            z67VarC0.getClass();
            strSubstring = strSubstring.substring(z67VarC0.a, z67VarC0.b + 1);
        }
        String str = "";
        int i3 = 0;
        while (i2 < strSubstring.length()) {
            int i4 = i3 + 1;
            str = str + strSubstring.charAt(i2);
            if (i4 == this.a || i3 + 2 == this.b) {
                str = str + ((be3) this.d).b;
            }
            i2++;
            i3 = i4;
        }
        return new w2f(new k00(str), (vd9) this.e);
    }

    public void b(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        if (i < 0 || i >= arrayList.size()) {
            qc0.j(ks0.k("Line index ", i, " out of range, number of lines: ", arrayList.size()));
            return;
        }
        std stdVar = (std) arrayList.get(i);
        if (i2 < 0 || i2 > stdVar.a.length()) {
            qc0.j(ks0.k("Index ", i2, " out of range, line length: ", stdVar.a.length()));
        }
    }

    public int c(char c) {
        int i = 0;
        while (true) {
            char cM = m();
            if (cM == 0) {
                return -1;
            }
            if (cM == c) {
                return i;
            }
            i++;
            j();
        }
    }

    public void d() {
        int i = this.c;
        this.c = i == Integer.MIN_VALUE ? this.a : i + this.b;
        this.e = ((String) this.d) + this.c;
    }

    public mx e(una unaVar, una unaVar2) {
        ArrayList arrayList = (ArrayList) this.d;
        int i = unaVar.a;
        int i2 = unaVar.b;
        int i3 = unaVar2.a;
        int i4 = unaVar2.b;
        if (i == i3) {
            std stdVar = (std) arrayList.get(i);
            CharSequence charSequenceSubSequence = stdVar.a.subSequence(i2, i4);
            vtd vtdVar = stdVar.b;
            std stdVar2 = new std(charSequenceSubSequence, vtdVar != null ? vtdVar.a(i2, i4) : null);
            mx mxVar = new mx(3, false);
            mxVar.a.add(stdVar2);
            return mxVar;
        }
        mx mxVar2 = new mx(3, false);
        std stdVar3 = (std) arrayList.get(i);
        std stdVarA = stdVar3.a(i2, stdVar3.a.length());
        ArrayList arrayList2 = mxVar2.a;
        arrayList2.add(stdVarA);
        while (true) {
            i++;
            if (i >= i3) {
                arrayList2.add(((std) arrayList.get(i3)).a(0, i4));
                return mxVar2;
            }
            arrayList2.add((std) arrayList.get(i));
        }
    }

    public boolean f() {
        return this.b < this.c || this.a < ((ArrayList) this.d).size() - 1;
    }

    public int g(ssg ssgVar) {
        int i = 0;
        while (((BitSet) ssgVar.b).get(m())) {
            i++;
            j();
        }
        return i;
    }

    public int h(char c) {
        int i = 0;
        while (m() == c) {
            i++;
            j();
        }
        return i;
    }

    public void i() {
        if (this.c != Integer.MIN_VALUE) {
            return;
        }
        qc0.p("generateNewId() must be called before retrieving ids.");
    }

    public void j() {
        ArrayList arrayList = (ArrayList) this.d;
        int i = this.b + 1;
        this.b = i;
        if (i > this.c) {
            int i2 = this.a + 1;
            this.a = i2;
            if (i2 < arrayList.size()) {
                std stdVar = (std) arrayList.get(this.a);
                this.e = stdVar;
                this.c = stdVar.a.length();
            } else {
                std stdVar2 = new std("", null);
                this.e = stdVar2;
                this.c = stdVar2.a.length();
            }
            this.b = 0;
        }
    }

    public boolean k(char c) {
        if (m() != c) {
            return false;
        }
        j();
        return true;
    }

    public boolean l(String str) {
        int i = this.b;
        if (i < this.c && str.length() + i <= this.c) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (((std) this.e).a.charAt(this.b + i2) == str.charAt(i2)) {
                }
            }
            this.b = str.length() + this.b;
            return true;
        }
        return false;
    }

    public char m() {
        int i = this.b;
        if (i < this.c) {
            return ((std) this.e).a.charAt(i);
        }
        return this.a < ((ArrayList) this.d).size() + (-1) ? '\n' : (char) 0;
    }

    public una n() {
        return new una(this.a, this.b);
    }

    public void o(una unaVar) {
        int i = unaVar.a;
        int i2 = unaVar.b;
        b(i, i2);
        this.a = i;
        this.b = i2;
        std stdVar = (std) ((ArrayList) this.d).get(i);
        this.e = stdVar;
        this.c = stdVar.a.length();
    }

    public int p() {
        int i = 0;
        while (true) {
            char cM = m();
            if (cM != ' ') {
                switch (cM) {
                    case '\t':
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        break;
                    default:
                        return i;
                }
            }
            i++;
            j();
        }
    }

    public xg3(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public xg3(int i, int i2, int i3) {
        String strG;
        if (i == Integer.MIN_VALUE) {
            strG = "";
        } else {
            strG = ub3.g(i, "/");
        }
        this.d = strG;
        this.a = i2;
        this.b = i3;
        this.c = Integer.MIN_VALUE;
        this.e = "";
    }

    public xg3(be3 be3Var) {
        this.d = be3Var;
        String str = be3Var.a;
        char c = be3Var.b;
        this.a = v4e.N(str, c, 0, 6);
        this.b = v4e.S(str, c, 0, 6);
        this.c = be3Var.c.length();
        this.e = new vd9(13, this);
    }
}

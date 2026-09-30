package com.google.gson;

import defpackage.qc0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class FormattingStyle {
    public static final FormattingStyle COMPACT = new FormattingStyle("", "", false);
    public static final FormattingStyle PRETTY = new FormattingStyle("\n", "  ", true);
    private final String indent;
    private final String newline;
    private final boolean spaceAfterSeparators;

    private FormattingStyle(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            qc0.j("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            qc0.j("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.newline = str;
        this.indent = str2;
        this.spaceAfterSeparators = z;
    }

    public String getIndent() {
        return this.indent;
    }

    public String getNewline() {
        return this.newline;
    }

    public boolean usesSpaceAfterSeparators() {
        return this.spaceAfterSeparators;
    }

    public FormattingStyle withIndent(String str) {
        return new FormattingStyle(this.newline, str, this.spaceAfterSeparators);
    }

    public FormattingStyle withNewline(String str) {
        return new FormattingStyle(str, this.indent, this.spaceAfterSeparators);
    }

    public FormattingStyle withSpaceAfterSeparators(boolean z) {
        return new FormattingStyle(this.newline, this.indent, z);
    }
}

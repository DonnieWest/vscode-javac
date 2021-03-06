package org.javacs;

import com.sun.javadoc.*;

class EmptyRootDoc implements RootDoc {
    static final EmptyRootDoc INSTANCE = new EmptyRootDoc();

    private EmptyRootDoc() {}

    @Override
    public String[][] options() {
        return new String[0][];
    }

    @Override
    public PackageDoc[] specifiedPackages() {
        return new PackageDoc[0];
    }

    @Override
    public ClassDoc[] specifiedClasses() {
        return new ClassDoc[0];
    }

    @Override
    public ClassDoc[] classes() {
        return new ClassDoc[0];
    }

    @Override
    public PackageDoc packageNamed(String name) {
        return null;
    }

    @Override
    public ClassDoc classNamed(String qualifiedName) {
        return null;
    }

    @Override
    public String commentText() {
        return null;
    }

    @Override
    public Tag[] tags() {
        return new Tag[0];
    }

    @Override
    public Tag[] tags(String tagname) {
        return new Tag[0];
    }

    @Override
    public SeeTag[] seeTags() {
        return new SeeTag[0];
    }

    @Override
    public Tag[] inlineTags() {
        return new Tag[0];
    }

    @Override
    public Tag[] firstSentenceTags() {
        return new Tag[0];
    }

    @Override
    public String getRawCommentText() {
        return null;
    }

    @Override
    public void setRawCommentText(String rawDocumentation) {}

    @Override
    public String name() {
        return null;
    }

    @Override
    public int compareTo(Object obj) {
        return 0;
    }

    @Override
    public boolean isField() {
        return false;
    }

    @Override
    public boolean isEnumConstant() {
        return false;
    }

    @Override
    public boolean isConstructor() {
        return false;
    }

    @Override
    public boolean isMethod() {
        return false;
    }

    @Override
    public boolean isAnnotationTypeElement() {
        return false;
    }

    @Override
    public boolean isInterface() {
        return false;
    }

    @Override
    public boolean isException() {
        return false;
    }

    @Override
    public boolean isError() {
        return false;
    }

    @Override
    public boolean isEnum() {
        return false;
    }

    @Override
    public boolean isAnnotationType() {
        return false;
    }

    @Override
    public boolean isOrdinaryClass() {
        return false;
    }

    @Override
    public boolean isClass() {
        return false;
    }

    @Override
    public boolean isIncluded() {
        return false;
    }

    @Override
    public SourcePosition position() {
        return null;
    }

    @Override
    public void printError(String msg) {}

    @Override
    public void printError(SourcePosition pos, String msg) {}

    @Override
    public void printWarning(String msg) {}

    @Override
    public void printWarning(SourcePosition pos, String msg) {}

    @Override
    public void printNotice(String msg) {}

    @Override
    public void printNotice(SourcePosition pos, String msg) {}
}

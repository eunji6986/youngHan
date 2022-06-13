package lovepower.hellospring.concept;

abstract class CardBody implements PlayingCard{

    @Override
    public void move(int x, int y) {

    }

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }
}
